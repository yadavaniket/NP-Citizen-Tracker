package com.example.npcitizentracker;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class OTPByWorkers extends AppCompatActivity {

    TextView textViewenterotpbyworker;
    TextView textViewcodebyworker;
    EditText editTextenterotpbyworker;
    Button buttonverifyotp;
    Intent intentotpbyworker;
    //TextView textViewtimer;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p_by_workers);
        textViewcodebyworker = findViewById(R.id.textViewcodebyworker);
        //textViewtimer = findViewById(R.id.textViewtimer);
        textViewenterotpbyworker = findViewById(R.id.textViewenterotpbyworker);
        editTextenterotpbyworker = findViewById(R.id.editTextenterotpbyworker);
        buttonverifyotp = findViewById(R.id.buttonverifyotp);
        intentotpbyworker = getIntent();
    }

    public void VerifyOTP(View view)
    {
        // FORCE TO ENTER OTP
        if(editTextenterotpbyworker.getText().toString().matches(""))
        {
            editTextenterotpbyworker.requestFocus();

            Toast.makeText(getApplicationContext(), "Enter OTP", Toast.LENGTH_SHORT).show();

        }else{
            // ALERT MSG.
            alertmsg(view);
           // Intent verifyIntent = new Intent(OTPByWorkers.this, Home.class);
            //startActivity(verifyIntent);
        }
    }

    // ALERT MESSAGE POP UP MESSAGE
    public void alertmsg (View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
        builder.setTitle("ALERT");
        builder.setMessage("You have been successfully added to the Netprophets Cyberworks COVID-19 Quarantine Solution. We wish you a Speed recovery.");
        builder.setCancelable(true);
        final AlertDialog dlg = builder.create();
        dlg.show();
        final Timer t = new Timer();
        t.schedule(new TimerTask() {
            public void run() {
                dlg.dismiss();
                t.cancel();
                Intent verifyIntent = new Intent(OTPByWorkers.this, Home.class);
                startActivity(verifyIntent);
            }
        }, 4000);
    }
}



