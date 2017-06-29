package com.mac.training.filmzealot.screens.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mac.training.filmzealot.R;
import com.mac.training.filmzealot.screens.list.MoviesActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(SplashActivity.this, MoviesActivity.class));
        finish();
    }
}
