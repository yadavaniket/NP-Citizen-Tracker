package com.example.npcitizentracker;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
//import android.widget.Toast;

import java.util.ArrayList;


public class UpdateStatus extends AppCompatActivity {

    Intent submitintent;
    CheckBox feverU;
    CheckBox tirednessU;
    CheckBox coughU;
    CheckBox breathingU;
    EditText temperature;
    ArrayList<String> select = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_status);
       feverU = findViewById(R.id.checkBoxFever);
       tirednessU = findViewById(R.id.checkBoxTiredness);
       breathingU = findViewById(R.id.checkBoxBreathing);
       coughU = findViewById(R.id.checkBoxCough);
        temperature = findViewById(R.id.editTextTemperature);

        getIntent();

        // MENU COLOR CHANGE
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00408D"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);

    }

    // SELFIE CAPTURE METHOD
    public void Selfie(View view) {

    }

     //  CHECK BOX CLICKING AND SAVE TO HISTORY SECTION
    // I AM NOT COMMENTING THIS DUE TO XML ERROR 
    // SO U CAN DELETE THIS OR COMMENT OUT
    // YOUR LOVELY SHREY
    // THANK YOU

  public void onCheckedBox(View view){

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.checkBoxCough:
                if (checked){
                    select.add("Cough");
                }else {
                    select.remove("Cough");
                }break;
            case R.id.checkBoxBreathing:
                if (checked){
                    select.add("Breathing");
                }else {
                    select.remove("Breathing");
                }break;
            case R.id.checkBoxFever:
                if (checked){
                    select.add("Fever");
                }else {
                    select.remove("Fever");
                }break;
            case R.id.checkBoxTiredness:
                if (checked){
                    select.add("Tiredness");
                }else {
                    select.remove("Tiredness");
                }break;
            default:break;
        }

    }




    public void Submit(View view) {
       /* if (temperature.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "enter Temperature", Toast.LENGTH_SHORT).show();
        } else {
            StringBuilder finalSypmtom = new StringBuilder();
            for (String done : select){
                finalSypmtom.append("  ").append(done);
            }

        */
          //  String temp = temperature.getText().toString();
            submitintent = new Intent(UpdateStatus.this, History.class);
          //  submitintent.putExtra("finalSypmtom", finalSypmtom.toString());
            //submitintent.putExtra("Temperature", temp);
            startActivity(submitintent);

        }

}







