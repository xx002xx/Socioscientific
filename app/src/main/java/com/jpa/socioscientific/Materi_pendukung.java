package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Materi_pendukung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_pendukung);

        TextView home = findViewById(R.id.txthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MenuUtama.class);
                startActivity(intent);
                finish();
            }
        });


        Button btn_dil_1 = findViewById(R.id.btn_dil_1);
        btn_dil_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Mengevaluasi_alternatif_solusi_berdasarkan_kriteria_1.class);
                startActivity(intent);
                finish();
            }
        });

        Button btn_dil_2 = findViewById(R.id.btn_dil_2);
        btn_dil_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Mengevaluasi_alternatif_solusi_berdasarkan_kriteria_2.class);
                startActivity(intent);
                finish();
            }
        });

        Button btn_dil_3 = findViewById(R.id.btn_dil_3);
        btn_dil_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Mengevaluasi_alternatif_solusi_berdasarkan_kriteria_3.class);
                startActivity(intent);
                finish();
            }
        });


        ImageView per_iklim = findViewById(R.id.per_iklim);
        per_iklim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Perubahan_iklim_kota_besar.class);
                startActivity(intent);
            }
        });


        ImageView usn_senyawa = findViewById(R.id.usn_senyawa);
        usn_senyawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Perubahan_iklim_unsur_senyawa.class);
                startActivity(intent);
            }
        });


        ImageView per_iklim2 = findViewById(R.id.per_iklim2);
        per_iklim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Perubahan_iklim_kenaikan_suhu.class);
                startActivity(intent);
            }
        });


        ImageView per_iklimd = findViewById(R.id.per_iklimd);
        per_iklimd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Perubahan_iklim_pencemaran_lingkungan.class);
                startActivity(intent);
            }
        });

    }
}