package com.marcosdeveloper.appandroid.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.marcosdeveloper.appandroid.R;
import com.marcosdeveloper.appandroid.control.carDAO;
import com.marcosdeveloper.appandroid.model.Carro;


public class Principal extends AppCompatActivity {

    private LinearLayout layoutPrincipal;
    private TableLayout tblprincipal;
    private int bId1;
    private int bId2;
    private Carro car1;
    private Carro car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createResources();
        tabela();
    }

    private void createResources(){
        tblprincipal = (TableLayout) findViewById(R.id.tbl_principal);
        Intent it = getIntent();
        Bundle param = it.getExtras();
        if(param!=null){
            bId1 = param.getInt("pId");
            bId2 = param.getInt("pId2");
        }
        car1 = (Carro) new carDAO(getApplicationContext()).buscarCarros(bId1);
        car2 = (Carro) new carDAO(getApplicationContext()).buscarCarros(bId2);
    }

    private void montarcb(){
        tblprincipal.removeAllViews();
        TableRow tr = new TableRow(this);
        TextView t1 = new TextView(this);
        t1.setText("modelo");
        tr.addView(t1);
        TextView t2 = new TextView(this);
        t2.setText(car1.row());
        tr.addView(t2);
        TextView t3 = new TextView(this);
        t3.setText(car2.row());
        tr.addView(t3);
        tblprincipal.addView(tr);
    }


    private void tabela(){
       montarcb();
    }


}