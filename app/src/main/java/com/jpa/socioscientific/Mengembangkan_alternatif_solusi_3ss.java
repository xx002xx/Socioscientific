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

public class Mengembangkan_alternatif_solusi_3ss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengembangkan_alternatif_solusi3ss);

        EditText isi_identifikasi = findViewById(R.id.isi_identifikasi1);
        EditText isi_identifikasi2 = findViewById(R.id.isi_identifikasi2);
        EditText isi_identifikasi3 = findViewById(R.id.isi_identifikasi3);


        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences sh = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);
        String identifikasi = sh.getString("identifikasi123sc", "");
        String identifikasi2 = sh.getString("identifikasi223sc", "");
        String identifikasi3 = sh.getString("identifikasi323sc", "");

        isi_identifikasi.setText(identifikasi);
        isi_identifikasi2.setText(identifikasi2);
        isi_identifikasi3.setText(identifikasi3);

        TextView home = findViewById(R.id.txthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MenuUtama.class);
                startActivity(intent);
                finish();
            }
        });


        Button txtmasalah = findViewById(R.id.txtmasalah);
        txtmasalah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Mengidentifikasi_masalah_3ss.class);
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
                myEdit.putString("identifikasi123sc", isi_identifikasi.getText().toString());
                myEdit.putString("identifikasi223sc", isi_identifikasi2.getText().toString());
                myEdit.putString("identifikasi323sc", isi_identifikasi3.getText().toString());
                myEdit.apply();

                Intent intent=new Intent(getApplicationContext(), Mengembangkan_kriteria_solusi_3ss.class);
                startActivity(intent);
                finish();
            }
        });

    }
}