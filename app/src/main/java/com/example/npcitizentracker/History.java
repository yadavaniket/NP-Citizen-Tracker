package com.example.npcitizentracker;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Locale;

public class History extends AppCompatActivity {

    TextView date;
    TextView time;
    TextView textViewtemperature;
    TextView temp;
    TextView currentdate;
    TextView currenttime;
    TextView Symptom;
    ImageView profile;
    Intent dataintent;

    @SuppressLint({"SetTextI18n", "ResourceAsColor"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        Symptom = findViewById(R.id.textViewSymptoms);
        currentdate = findViewById(R.id.textViewCurrentDate);
        currenttime = findViewById(R.id.textViewCurrentTime);
        temp = findViewById(R.id.textViewtemp);
        textViewtemperature = findViewById(R.id.textViewTemperature);
        time = findViewById(R.id.textViewtime);
        date = findViewById(R.id.textViewDate);
        profile = findViewById(R.id.imageViewprofile);

        // ACTION BAR COLOR CHANGE
        dataintent = getIntent();
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00408D"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);

        //time and Date and temp.

       /* String getSymptom = dataintent.getStringExtra("finalSypmtom");
        Symptom.setText(getSymptom);
        String getTemperature = dataintent.getStringExtra("Temperature");
        temp.setText( getTemperature + " °f");
        String stringDate = new SimpleDateFormat("dd-MM-yyyy",Locale.getDefault()).format(new Date());
        String stringTime = new SimpleDateFormat("hh:mm a",Locale.getDefault()).format(new Date());
        currenttime.setText(stringTime);
        currentdate.setText(stringDate);

        */
    }

    // MENU METHODS
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater findMenuItems = getMenuInflater();
        findMenuItems.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

// LOGOUT INTENT SEND TO MOBILE NO. SCREEN
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_Menu) {
            Intent LogoutIntent = new Intent(History.this, Mobileno.class);
            startActivity(LogoutIntent);
        }
        return super.onOptionsItemSelected(item);
    }

    // BUTTON CLICK CHANGES INTENT
    public void Home(View view){
        Intent homeIntent = new Intent(History.this, Home.class);
        startActivity(homeIntent);
    }

    // BUTTON CLICK CHANGES INTENT
    public void EditLocation(View view){
        Intent EditLocationIntent = new Intent(History.this, EditLocation.class);
        startActivity(EditLocationIntent);
    }
}
