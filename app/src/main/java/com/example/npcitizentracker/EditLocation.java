package com.example.npcitizentracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class EditLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_location);
        getIntent();

        // DIRECT SEND SCREEN TO CHANGE THE LOCATION OF USER
        Intent locationintent = new Intent(EditLocation.this, SetYourLocation.class);
        startActivity(locationintent);
    }
}
