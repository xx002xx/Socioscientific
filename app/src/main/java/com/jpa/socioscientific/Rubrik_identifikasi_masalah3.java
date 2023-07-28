package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Rubrik_identifikasi_masalah3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubrik_identifikasi_masalah3);

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
                Intent intent=new Intent(getApplicationContext(), Mengembangkan_alternatif_solusi3.class);
                startActivity(intent);
                finish();
            }
        });


        Button btnjawaban = findViewById(R.id.btnjawaban);
        btnjawaban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Mengidentifikasi_masalah_3.class);
                startActivity(intent);
                finish();


            }
        });

    }
}