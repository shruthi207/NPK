package com.example.myagriapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void moisture(View view){
        startActivity(new Intent(this, moisture.class));
    }


    public void Phosphorous (View view){
        startActivity(new Intent(this, phosphorous.class));
    }

    public void Potassium (View view){
        startActivity(new Intent(this, potassium.class));
    }

    public void Nitrogen (View view) {
        startActivity(new Intent(this,nitro.class));
    }
}
