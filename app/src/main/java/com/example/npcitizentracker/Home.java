package com.example.npcitizentracker;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home extends AppCompatActivity {

    EditText editTextCategory, editTextName, editTextDOB, editTextGender;
    EditText editTextHealthWorker, editTextQuarantineAt, editTextYourAddress, editTextQuarantineViolation;
    Button buttonHome, buttonHistory, buttonEditLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getIntent();

        editTextCategory = findViewById(R.id.editTextcatagory);
        editTextDOB = findViewById(R.id.editTextDOB);
        editTextName = findViewById(R.id.editTextName);
        editTextGender = findViewById(R.id.editTextGender);
        editTextHealthWorker = findViewById(R.id.editTexthealthworker);
        editTextQuarantineAt = findViewById(R.id.editTextQuarantineAt);
        editTextYourAddress = findViewById(R.id.editTextyouraddress);
        editTextQuarantineViolation = findViewById(R.id.editTextQuarantineViolationTillNow);

        buttonEditLocation = findViewById(R.id.buttonEditLocation);
        buttonHome = findViewById(R.id.buttonHome);
        buttonHistory = findViewById(R.id.buttonHistory);

        // TO CHANGE ACTION BAR COLOR
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00408D"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);


    }

    // MENU METHODS
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater findMenuItems = getMenuInflater();
        findMenuItems.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_Menu) {
            Intent LoginIntent = new Intent(Home.this, Mobileno.class);
            startActivity(LoginIntent);
        }

        return super.onOptionsItemSelected(item);
    }


    // BUTTON CLICK CHANGES INTENT
    public void History (View view){
        Intent historyIntent = new Intent(Home.this, History.class);
        startActivity(historyIntent);
    }

    // BUTTON CLICK CHANGES INTENT
    public void EditLocation (View view){
        Intent EditLocationIntent= new Intent(Home.this, EditLocation.class);
        startActivity(EditLocationIntent);
    }
    // BUTTON CLICK CHANGES INTENT
    public void UpdateStatus (View view){
        Intent updatestatusIntent = new Intent(Home.this, UpdateStatus.class);
        startActivity(updatestatusIntent);
    }
}
