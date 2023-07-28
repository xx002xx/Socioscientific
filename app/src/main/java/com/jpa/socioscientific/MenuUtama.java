package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Ref;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        TextView home = findViewById(R.id.txthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });

        Button ptbljr = findViewById(R.id.ptbljrmenu);
        ptbljr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), PetunjukBelajar.class);
                startActivity(intent);

            }
        });


        Button kompetensidasar = findViewById(R.id.kompetensidasar);
        kompetensidasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Kompetensidasar.class);
                startActivity(intent);

            }
        });

        Button petakonsep = findViewById(R.id.petakonsep);
        petakonsep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), PetaKonsp.class);
                startActivity(intent);

            }
        });

        Button btn_glosarium = findViewById(R.id.btn_glosarium);
        btn_glosarium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Glosarium.class);
                startActivity(intent);

            }
        });


        Button btn_ref = findViewById(R.id.btn_ref);
        btn_ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Referensi.class);
                startActivity(intent);

            }
        });

        Button btn_materi = findViewById(R.id.btn_materi);
        btn_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Materi.class);
                startActivity(intent);

            }
        });


        Button btn_eval = findViewById(R.id.btn_eval);
        btn_eval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), DIlema_3.class);
                startActivity(intent);

            }
        });


    }
}