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

public class Mengembangkan_kriteria_solusi_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengembangkan_kriteria_solusi3);

        EditText isi_identifikasi = findViewById(R.id.isi_identifikasi1);
        EditText isi_identifikasi2 = findViewById(R.id.isi_identifikasi2);
        EditText isi_identifikasi3 = findViewById(R.id.isi_identifikasi3);


        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences sh = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);
        String identifikasi = sh.getString("kriteria1233", "");
        String identifikasi2 = sh.getString("kriteria2233", "");
        String identifikasi3 = sh.getString("kriteria3233", "");

        isi_identifikasi.setText(identifikasi);
        isi_identifikasi2.setText(identifikasi2);
        isi_identifikasi3.setText(identifikasi3);

        TextView home = findViewById(R.id.txthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Dilema_plas.class);
                startActivity(intent);
                finish();
            }
        });


        Button txtmasalah = findViewById(R.id.txtmasalah);
        txtmasalah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Dilema_plas.class);
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
                myEdit.putString("kriteria1233", isi_identifikasi.getText().toString());
                myEdit.putString("kriteria2233", isi_identifikasi2.getText().toString());
                myEdit.putString("kriteria3233", isi_identifikasi3.getText().toString());
                myEdit.apply();

                Intent intent=new Intent(getApplicationContext(), Rubrik_mengembangkan_kriteria_3.class);
                startActivity(intent);
                finish();
            }
        });

    }
}