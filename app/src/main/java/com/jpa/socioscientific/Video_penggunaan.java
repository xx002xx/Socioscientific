package com.jpa.socioscientific;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Video_penggunaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_penggunaan);


        TextView home = findViewById(R.id.txthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        WebView view = findViewById(R.id.VideoView);

        view.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                emulateClick(view);
            }
        });

        view.getSettings().setAppCacheEnabled(true);
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setAppCachePath(getCacheDir().getAbsolutePath());
        view.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        view.getSettings().setMediaPlaybackRequiresUserGesture(false);
        //view.loadUrl("https://www.youtube.com/embed/bHQqvYy5KYo?autoplay=1");
        view.loadUrl("https://www.youtube.com/embed/fH8z46_LgUY");


    }
    private void emulateClick(final WebView webview) {
        long delta = 100;
        long downTime = SystemClock.uptimeMillis();
        float x = webview.getLeft() + webview.getWidth() / 2; //in the middle of the webview
        float y = webview.getTop() + webview.getHeight() / 2;

        final MotionEvent downEvent = MotionEvent.obtain(downTime, downTime + delta, MotionEvent.ACTION_DOWN, x, y, 0);
        // change the position of touch event, otherwise, it'll show the menu.
        final MotionEvent upEvent = MotionEvent.obtain(downTime, downTime + delta, MotionEvent.ACTION_UP, x + 10, y + 10, 0);

        webview.post(new Runnable() {
            @Override
            public void run() {
                if (webview != null) {
                    webview.dispatchTouchEvent(downEvent);
                    webview.dispatchTouchEvent(upEvent);
                }
            }
        });
    }
}