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

public class Mengevaluasi_alternatif_solusi_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengevaluasi_alternatif_solusi1);

        EditText isi_kekurangan1 = findViewById(R.id.isi_kekurangan1);
        EditText isi_kelebihan1 = findViewById(R.id.isi_kelebihan1);

        EditText isi_kekurangan2 = findViewById(R.id.isi_kekurangan2);
        EditText isi_kelebihan2 = findViewById(R.id.isi_kelebihan2);

        EditText isi_kekurangan3 = findViewById(R.id.isi_kekurangan3);
        EditText isi_kelebihan3 = findViewById(R.id.isi_kelebihan3);


        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences sh = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);
        String kelebihan1 = sh.getString("kelebihan1", "");
        String kekurangan1 = sh.getString("kekurangan1", "");

        String kelebihan2 = sh.getString("kelebihan2", "");
        String kekurangan2 = sh.getString("kekurangan2", "");

        String kelebihan3 = sh.getString("kelebihan3", "");
        String kekurangan3 = sh.getString("kekurangan3", "");

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
                Intent intent=new Intent(getApplicationContext(), Dilema_co.class);
                startActivity(intent);
                finish();
            }
        });


        Button txtmasalah = findViewById(R.id.txtmasalah);
        txtmasalah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Dilema_co.class);
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
                myEdit.putString("kelebihan1", isi_kelebihan1.getText().toString());
                myEdit.putString("kekurangan1", isi_kekurangan1.getText().toString());

                myEdit.putString("kelebihan2", isi_kelebihan2.getText().toString());
                myEdit.putString("kekurangan2", isi_kekurangan2.getText().toString());

                myEdit.putString("kelebihan3", isi_kelebihan3.getText().toString());
                myEdit.putString("kekurangan3", isi_kekurangan3.getText().toString());

                myEdit.apply();

                Intent intent=new Intent(getApplicationContext(), Rubrik_mengevaluasi_1.class);
                startActivity(intent);
                finish();
            }
        });


    }
}