package com.example.npcitizentracker;

//import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//import com.google.firebase.auth.FirebaseAuth;
/*import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
*/

public class Login extends AppCompatActivity {

    TextView textViewenterotp;
    TextView textViewcode;
    EditText editTextcode;
    Button buttonlogin;
    Intent intentlogin;
   // String codesent;
    //FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textViewcode = findViewById(R.id.textViewcode);
        textViewenterotp = findViewById(R.id.textViewenterotp);
        editTextcode = findViewById(R.id.editTextcode);
        buttonlogin = findViewById(R.id.buttonlogin);
        intentlogin = getIntent();


        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00408D"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);
    }

    public void login(View view) {

        // FORCE TO ENTER OTP
        editTextcode.requestFocus();

        Toast.makeText(getApplicationContext(), "Enter OTP", Toast.LENGTH_SHORT).show();
/*
        String code =  editTextcode.getText().toString();
        if (code.isEmpty()){
            editTextcode.setError("please enter the otp code");
            editTextcode.requestFocus();
        }else{
            PhoneAuthCredential credential = PhoneAuthProvider.getCredential(codesent, code);
            signInWithPhoneAuthCredential(credential);
        }

 */
    }
  /*  private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Login.this, "Login successfully", Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(Login.this, "Login failed", Toast.LENGTH_SHORT).show();

                            if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
                                Toast.makeText(Login.this, "you enter wrong otp", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });
    }
*/
    public void resendotp(View view) {

        // INTENT TO NEXT SCREEN
        Intent loginintent = new Intent(Login.this, LocationEntry.class);
        startActivity(loginintent);

    }
}

