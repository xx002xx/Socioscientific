package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Perubahan_iklim_unsur_senyawa extends AppCompatActivity {
    int bil = 68;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perubahan_iklim_unsur_senyawa);
        RelativeLayout layout= findViewById(R.id.isumt);
        layout.setBackground(getResources().getDrawable(R.drawable.mk68));

        TextView home = findViewById(R.id.txthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Materi_pendukung.class);
                startActivity(intent);
                finish();
            }
        });

        TextView prev = findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bil = bil - 1;

                if(bil < 68){
                    bil = 68;
                }

                cangeback(bil);
            }
        });

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bil = bil + 1;

                if(bil > 76){
                    bil = 76;
                }

                cangeback(bil);
            }
        });

    }
    private void cangeback(int bil) {
        String bs = "@drawable/mk"+ bil;

        Log.d("url",bs);
        int resourceID = getResources().getIdentifier(bs, null, getPackageName());
        Log.d("res", String.valueOf(resourceID));
        Drawable res = getResources().getDrawable(resourceID);
        RelativeLayout layout= findViewById(R.id.isumt);
        layout.setBackground(res);

    }
}