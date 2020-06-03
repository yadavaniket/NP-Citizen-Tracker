package com.example.npcitizentracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LocationEntry extends AppCompatActivity {

    ImageView imageViewLocation;
    TextView textViewLocation;
    Button buttonSetLocation;
    Intent intentlocationentry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lccation_entry);
        imageViewLocation = findViewById(R.id.imageViewLocation);
        textViewLocation = findViewById(R.id.textViewLocation);
        buttonSetLocation = findViewById(R.id.buttonSetLocation);

        intentlocationentry = getIntent();
    }

    public void SetYourQuarantineLocation(View view) {
        // INTENT TO NEXT SCREEN
        Intent SetYourQuarantineLocation= new Intent(LocationEntry.this, SetYourLocation.class);
        startActivity(SetYourQuarantineLocation);

    }
}







