package com.madmantoo.mov;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        ImageView logo = findViewById(R.id.imageView);
        TextView txt = findViewById(R.id.txt);

        Animation app_splash = AnimationUtils.loadAnimation(this, R.anim.app_splash);
        Animation btt = AnimationUtils.loadAnimation(this, R.anim.btt);

        logo.startAnimation(app_splash);
        txt.startAnimation(btt);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent main = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(main);
                finish();
            }
        }, 2000);
    }
}
