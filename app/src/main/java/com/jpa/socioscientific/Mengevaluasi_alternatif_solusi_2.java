package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mengevaluasi_alternatif_solusi_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengevaluasi_alternatif_solusi2);
        EditText isi_kekurangan1 = findViewById(R.id.isi_kekurangan1);
        EditText isi_kelebihan1 = findViewById(R.id.isi_kelebihan1);

        EditText isi_kekurangan2 = findViewById(R.id.isi_kekurangan2);
        EditText isi_kelebihan2 = findViewById(R.id.isi_kelebihan2);

        EditText isi_kekurangan3 = findViewById(R.id.isi_kekurangan3);
        EditText isi_kelebihan3 = findViewById(R.id.isi_kelebihan3);


        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences sh = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);
        String kelebihan1 = sh.getString("kelebihan12", "");
        String kekurangan1 = sh.getString("kekurangan12", "");

        String kelebihan2 = sh.getString("kelebihan22", "");
        String kekurangan2 = sh.getString("kekurangan22", "");

        String kelebihan3 = sh.getString("kelebihan32", "");
        String kekurangan3 = sh.getString("kekurangan32", "");

        isi_kekurangan1.setText(kelebihan1);
        isi_kelebihan1.setText(kekurangan1);

        isi_kekurangan2.setText(kelebihan2);
        isi_kelebihan2.setText(kekurangan2);

        isi_kekurangan3.setText(kelebihan3);
        isi_kelebihan3.setText(kekurangan3);

        TextView home = findViewById(R.id.txthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Dilema_pro.class);
                startActivity(intent);
                finish();
            }
        });


        Button txtmasalah = findViewById(R.id.txtmasalah);
        txtmasalah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Dilema_pro.class);
                startActivity(intent);
                finish();
            }
        });


        Button btnjawaban = findViewById(R.id.btnjawaban);
        btnjawaban.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myEdit = sharedPreferences.edit();

                // write all the data entered by the user in SharedPreference and apply
                myEdit.putString("kelebihan12", isi_kelebihan1.getText().toString());
                myEdit.putString("kekurangan12", isi_kekurangan1.getText().toString());

                myEdit.putString("kelebihan22", isi_kelebihan2.getText().toString());
                myEdit.putString("kekurangan22", isi_kekurangan2.getText().toString());

                myEdit.putString("kelebihan32", isi_kelebihan3.getText().toString());
                myEdit.putString("kekurangan32", isi_kekurangan3.getText().toString());

                myEdit.apply();

                Intent intent=new Intent(getApplicationContext(), Rubrik_mengevaluasi_2.class);
                startActivity(intent);
                finish();
            }
        });


    }
}