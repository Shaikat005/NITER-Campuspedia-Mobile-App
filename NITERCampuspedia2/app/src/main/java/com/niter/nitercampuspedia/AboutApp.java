package com.niter.nitercampuspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AboutApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
        getSupportActionBar().setTitle("About this app");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}