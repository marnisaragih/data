package com.example.daftarmhs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainKelola extends AppCompatActivity {
    String[] items={"Marni eva kristina saragih", "Mika Sirait", "Cindy Claudya", "Laurentsia", "Angga",
            "Fransiska Ayu", "Tita", "yos rafel", "Adrian Paskalis", "Putu Abdi",
            "Cristian Dora","Agung", "Yasinta", "Desta", "Yalina Hosea", "Alfadeo Melody",
            "Baskoro Adi", "Arnol Stanly", "Brayen Chanzezar",
            "Yubelince","Hendry Masikun","Verina Kristanti"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_kelola);
        ListView lv = (ListView)findViewById(R.id.lvKelola);
        // Spinner spinner = findViewById(R.id.mSpinner);
        Button btnAdd3 = (Button)findViewById(R.id.btnAdd3);
        btnAdd3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainKelola.this,AddActivity.class);
                startActivity(i);
            }
        });

        Button btnEdit3 = (Button)findViewById(R.id.btnEdit3);
        btnEdit3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainKelola.this,EditActivity.class);
                startActivity(i);
            }
        });


        lv.setAdapter(new ArrayAdapter<String>(MainKelola.this, android.R.layout.simple_list_item_1,items));
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //   spinner.setAdapter(aa);

//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainKelolaActivity.this, "anda memilih" + items[position],Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                Toast.makeText(MainKelolaActivity.this,"anda memilih", Toast.LENGTH_SHORT).show();
//            }
//        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainKelola.this,"anda memilih = "+ items[position],Toast.LENGTH_LONG).show();  //toast utk pop up message
            }
        });

    }
}

