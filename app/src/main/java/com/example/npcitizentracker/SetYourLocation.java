package com.example.npcitizentracker;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class SetYourLocation extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinnerchooselace;
    EditText editTextaddress;
    Button buttonsave;
    Intent intentsetyourlocation;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_your_location);
        spinnerchooselace = findViewById(R.id.spinnerchooseplace);
        editTextaddress = findViewById(R.id.editTextaddress);
        buttonsave = findViewById(R.id.buttonSave);
        intentsetyourlocation = getIntent();

        // SPINNER TO CHOOSE THE LOCATION
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.choose_Location, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerchooselace.setAdapter(adapter);
        spinnerchooselace.setOnItemSelectedListener(this);

        // TO CHANGE ACTION BAR COLOR
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00408D"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);


    }
    // SPINNER METHODS
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        text = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {
        spinnerchooselace.requestFocus();
    }



    // INTENT CHANGE ON CLINKING BUTTON
    public void save(View view)
    {
        // FORCE TO ENTER ADDRESS AND CHANGE SCREEN
        if (editTextaddress.getText().toString().matches(""))
        {
            editTextaddress.requestFocus();

            Toast.makeText(getApplicationContext(), "Enter Address", Toast.LENGTH_SHORT).show();

        }else{
            Intent saveintent = new Intent(SetYourLocation.this, OTPByWorkers.class);
            startActivity(saveintent);
        }

    }

}
