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

public class Menetapkan_keputusan_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menetapkan_keputusan2);

        EditText isi_identifikasi = findViewById(R.id.isi_identifikasi3);


        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences sh = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);
        String identifikasi = sh.getString("kriteria122", "");

        isi_identifikasi.setText(identifikasi);

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
                myEdit.putString("kriteria122", isi_identifikasi.getText().toString());
                myEdit.apply();

                Intent intent=new Intent(getApplicationContext(), Rubrik_menetapkan_keputusan_2.class);
                startActivity(intent);
                finish();
            }
        });

    }
}