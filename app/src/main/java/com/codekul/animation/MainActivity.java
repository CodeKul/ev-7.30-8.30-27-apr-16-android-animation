package com.codekul.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnFade).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Animation animation =
                        AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
                animation.setRepeatMode(Animation.INFINITE);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        Log.i("@codekul","animation started");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                        Log.i("@codekul","animation ended");
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                        Log.i("@codekul","animation repeat");
                    }
                });
                findViewById(R.id.imageView).startAnimation(animation);
            }
        });
    }
}
