package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Referensi extends AppCompatActivity {
    int bil = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referensi);

        RelativeLayout layout= findViewById(R.id.ref);
        layout.setBackground(getResources().getDrawable(R.drawable.r100));

        TextView home = findViewById(R.id.txthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MenuUtama.class);
                startActivity(intent);
                finish();
            }
        });

        TextView prev = findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bil = bil - 1;

                if(bil < 100){
                    bil = 100;
                }

                cangeback(bil);
            }
        });

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bil = bil + 1;

                if(bil > 101){
                    bil = 101;
                }

                cangeback(bil);
            }
        });
    }


    private void cangeback(int bil) {
        String bs = "@drawable/r"+ bil;

        Log.d("url",bs);
        int resourceID = getResources().getIdentifier(bs, null, getPackageName());
        Log.d("res", String.valueOf(resourceID));
        Drawable res = getResources().getDrawable(resourceID);
        RelativeLayout layout= findViewById(R.id.ref);
        layout.setBackground(res);

    }
}