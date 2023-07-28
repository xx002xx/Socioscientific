package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView home = findViewById(R.id.txthome);
        EditText nama = findViewById(R.id.namas);
        EditText kelas = findViewById(R.id.kelasd);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        Button btnlogin = findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if(nama.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(),"Kamu Belum Memasukan Nama",Toast.LENGTH_SHORT).show();
            }
            if(kelas.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(),"Kamu Belum Memasukan Kelas",Toast.LENGTH_SHORT).show();
            }
            if(!nama.getText().toString().equals("") & !kelas.getText().toString().equals("")){

                Toast toast = Toast.makeText(getApplicationContext(), Html.fromHtml("<a  ><b style=\"font-size:30px;\">  Selamat Datang " + nama.getText().toString() + "</b></a>"), Toast.LENGTH_LONG);
                toast.show();

                Intent intent=new Intent(getApplicationContext(), MenuUtama.class);
                startActivity(intent);
                finish();
                }


            }
        });

    }
}