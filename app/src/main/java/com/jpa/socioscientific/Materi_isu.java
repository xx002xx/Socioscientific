package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Materi_isu extends AppCompatActivity {
    int bil = 77;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_isu);

        RelativeLayout layout= findViewById(R.id.isumt);
        layout.setBackground(getResources().getDrawable(R.drawable.mk77));

        TextView home = findViewById(R.id.txthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Materi.class);
                startActivity(intent);
                finish();
            }
        });

        TextView prev = findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bil = bil - 1;

                if(bil < 77){
                    bil = 77;
                }

                cangeback(bil);
            }
        });

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bil = bil + 1;

                if(bil > 99){
                    bil = 99;
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