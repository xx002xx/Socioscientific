package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Isu_sos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isu_sos);

        TextView home = findViewById(R.id.txthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Materi.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView img_co = findViewById(R.id.img_co);
        img_co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Dilema_co.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView img_pro = findViewById(R.id.img_pro);
        img_pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Dilema_pro.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView img_plas = findViewById(R.id.img_plas);
        img_plas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Dilema_plas.class);
                startActivity(intent);
                finish();
            }
        });

    }
}