package com.example.rajad.joat;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class splashfile extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashfile);
        Animation animation= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.ZORDER_TOP);
        animation.setDuration(1000);

        final ImageView splash1=(ImageView)findViewById(R.id.imageView3);

        splash1.startAnimation(animation);
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(splashfile.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
