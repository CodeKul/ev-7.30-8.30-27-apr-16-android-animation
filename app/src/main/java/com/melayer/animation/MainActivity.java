package com.melayer.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnRotate).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                findViewById(R.id.imageAnimation).startAnimation(animation);
            }
        });

        findViewById(R.id.btnScale).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                findViewById(R.id.imageAnimation).startAnimation(animation);
            }
        });

        findViewById(R.id.btnFade).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                findViewById(R.id.imageAnimation).startAnimation(animation);
            }
        });
    }
}
