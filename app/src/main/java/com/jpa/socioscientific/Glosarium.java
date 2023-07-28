package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Glosarium extends AppCompatActivity {
    int bil = 102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glosarium);


        RelativeLayout layout= findViewById(R.id.gl);
        layout.setBackground(getResources().getDrawable(R.drawable.g102));

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

                if(bil < 102){
                    bil = 102;
                }

                cangeback(bil);
            }
        });

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bil = bil + 1;

                if(bil > 104){
                    bil = 104;
                }

                cangeback(bil);
            }
        });

    }

    private void cangeback(int bil) {
        String bs = "@drawable/g"+ bil;

        Log.d("url",bs);
        int resourceID = getResources().getIdentifier(bs, null, getPackageName());
        Log.d("res", String.valueOf(resourceID));
        Drawable res = getResources().getDrawable(resourceID);
        RelativeLayout layout= findViewById(R.id.gl);
        layout.setBackground(res);

    }
}