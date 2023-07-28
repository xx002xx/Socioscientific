package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Dilema_co extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilema_co);
        TextView home = findViewById(R.id.txthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Isu_sos.class);
                startActivity(intent);
                finish();
            }
        });


        ImageView kep_co_mo = findViewById(R.id.kep_co_mo);
        kep_co_mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), KeputusanCo.class);
                startActivity(intent);

            }
        });
    }
}