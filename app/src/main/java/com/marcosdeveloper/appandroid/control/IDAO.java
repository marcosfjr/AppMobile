package com.marcosdeveloper.appandroid.control;

public interface IDAO {
    public final String DATABASE_NAME = "carro";

    public final int DATABASE_VERSION = 1;

    public final String CREATE_TABLE_CARROS =
            "CREATE TABLE carro(" +
                    "id INTEGER PRIMARY KEY," +
                    "marca TEXT," +
                    "modelo TEXT," +
                    "motor INTEGER," +
                    "ano INTEGER," +
                    "preco REAL,"+
                    "cavalos INTEGER," +
                    "etanol REAL," +
                    "revisao REAL,"+
                    "seguro REAL"+
                    ")";
    public final String DROP_TABLE_CARROS =
            "DROP TABLE IF EXISTS carro";


    public final String INSERT_TABLE_CARROS =

            "INSERT INTO carro(" +
            "marca ,"+
            "modelo ,"+
            "motor ,"+
            "ano ,"+
            "preco ,"+
            "cavalos ,"+
            "etanol ,"+
            "gasolina ,"+
            "revisao ,"+
            "seguro"+
           ")VALUES("+
            "VW,"+
            "Voyage,"+
            "1.0,"+
            "2015,"+
            "40390,"+
            "76,"+
            "9.6,"+
            "13.9,"+
            "420,"+
            "3100)," +
            "('Honta'," +
            "'Fit'," +
            "1.5," +
            "2015," +
            "51600," +
            "116," +
            "9.5," +
            "13.5," +
            "419," +
            "3200);";
}