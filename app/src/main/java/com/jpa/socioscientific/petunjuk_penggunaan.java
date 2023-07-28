package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class petunjuk_penggunaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk_penggunaan);
        TextView home = findViewById(R.id.txthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

        ImageView tulis = findViewById(R.id.tertulis);
        tulis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Petunjuk_tertulis.class);
                startActivity(intent);
                finish();

            }
        });

        ImageView vid = findViewById(R.id.vid);
        vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Video_penggunaan.class);
                startActivity(intent);
                finish();

            }
        });

    }
}