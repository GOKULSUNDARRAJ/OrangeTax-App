package com.RKSoft.organsTex;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Duration of wait
        int SPLASH_DISPLAY_LENGTH = 1000; // 2 seconds

        // Handler to start the main activity and close this splash screen after some seconds
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                // Start MainActivity
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
