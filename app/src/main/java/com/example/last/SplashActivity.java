package com.example.last;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

            Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }

}
