package com.niter.nitercampuspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AboutNITER extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_niter);
        getSupportActionBar().setTitle("About NITER");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}