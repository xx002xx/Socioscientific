package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Rubrik_mengembangkan_alternatif1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubrik_mengembangkan_alternatif1);

        TextView home = findViewById(R.id.txthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Dilema_co.class);
                startActivity(intent);
                finish();
            }
        });

        Button btn_lanjut = findViewById(R.id.btn_lanjut);
        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Mengembangkan_kriteria_solusi_1.class);
                startActivity(intent);
                finish();
            }
        });


        Button btn_perbaiki = findViewById(R.id.btn_perbaiki);
        btn_perbaiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Mengevaluasi_alternatif_solusi_1.class);
                startActivity(intent);
                finish();


            }
        });
    }
}