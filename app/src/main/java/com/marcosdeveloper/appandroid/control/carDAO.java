package com.marcosdeveloper.appandroid.control;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.marcosdeveloper.appandroid.model.Carro;

import java.util.ArrayList;
import java.util.List;


public class carDAO extends SQLiteOpenHelper {

    private Context context;

    public carDAO(Context context) {
        super(context, IDAO.DATABASE_NAME, null, IDAO.DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(IDAO.CREATE_TABLE_CARROS);
        db.execSQL(IDAO.INSERT_TABLE_CARROS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i2) {
        db.execSQL(IDAO.DROP_TABLE_CARROS);
        onCreate(db);
    }

    public List<Carro> buscarCarros(int bId1) {
        try {
            String[] where = new String[]{};
            SQLiteDatabase db = this.getReadableDatabase();
            String sql = "SELECT * FROM carro";
            List<Carro> cars = new ArrayList<>();
            Cursor cursor = db.rawQuery(sql, where);
            if (cursor.moveToFirst()) {
                do {
                    Carro car = new Carro();
                    car.setId(cursor.getInt(cursor.getColumnIndex("id")));
                    car.setMarca(cursor.getString(cursor.getColumnIndex("marca")));
                    car.setModelo(cursor.getString(cursor.getColumnIndex("modelo")));
                    car.setMotor(cursor.getDouble(cursor.getColumnIndex("motor")));
                    car.setAno(cursor.getInt(cursor.getColumnIndex("ano")));
                    car.setCavalo(cursor.getDouble(cursor.getColumnIndex("cavalo")));
                    car.setEtanol(cursor.getFloat(cursor.getColumnIndex("etanol")));
                    car.setGasolina(cursor.getFloat(cursor.getColumnIndex("gasolina")));
                    car.setRevisao(cursor.getDouble(cursor.getColumnIndex("revisao")));
                    car.setSeguro(cursor.getDouble(cursor.getColumnIndex("seguro")));
                    car.setPreco(cursor.getDouble(cursor.getColumnIndex("preco")));
                    cars.add(car);
                } while (cursor.moveToNext());
            }
            return cars;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


}