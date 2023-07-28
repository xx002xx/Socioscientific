package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {
    TextView app;
    private static int Splash_timeout = 6000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        app = findViewById(R.id.textview1);
        final ProgressBar simpleProgressBar = (ProgressBar) findViewById(R.id.simpleProgressBar);
        simpleProgressBar.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splasIntent  = new Intent(splashscreen.this,MainActivity.class);
                startActivity( splasIntent);
                finish();
            }
        },Splash_timeout);
        Animation myanim = AnimationUtils.loadAnimation(splashscreen.this,R.anim.animation2);
        app.startAnimation(myanim);
    }

}