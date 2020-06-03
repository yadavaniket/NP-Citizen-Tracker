package com.example.npcitizentracker;

//import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
/*import android.widget.Toast;

import com.google.firebase.FirebaseException;

import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

*/
public class Mobileno extends AppCompatActivity {

    TextView textViewCovidQuaraTracker;
    EditText userid;
    Intent intentmain;
    FirebaseAuth mAuth;
  //  String codesent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobileno);
        intentmain = getIntent();

        textViewCovidQuaraTracker = findViewById(R.id.textViewCovidQuaraTracker);
        userid = findViewById(R.id.editTextUserid);
        mAuth = FirebaseAuth.getInstance();

    }

    public void getotppassword(View view) {

        // FORCE TO ENTER THE NUMBER
        if (userid.getText().toString().matches(""))
        {
            userid.requestFocus();
            Toast.makeText(getApplicationContext(), "Enter User ID", Toast.LENGTH_SHORT).show();
        }else{
            Intent getotpintent = new Intent(Mobileno.this, Login.class);
            startActivity(getotpintent);
        }

        // ENTER MOBILE NO.
        /*String mobilenum = phoneno.getText().toString();
        if (mobilenum.isEmpty()){
            phoneno.setError(" plase enter mobile no ");
            phoneno.requestFocus();
            return;
        }else{
            FirebaseAuth.getInstance();
            String phoneNumber = phoneno.getText().toString();
            PhoneAuthProvider.getInstance().verifyPhoneNumber(
                   "+91" + phoneNumber,        // Phone number to verify
                    60,                 // Timeout duration
                    TimeUnit.SECONDS,   // Unit of timeout
                    this,               // Activity (for callback binding)
                    mCallbacks);        // OnVerificationStateChangedCallbacks
        }
*/
    }
    // VERIFICATION MOBILE NO.
    /* PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        @Override
        public void onVerificationCompleted(@NonNull PhoneAuthCredential credential) {
            Toast.makeText(getApplicationContext(), "In On Verification Completed", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onVerificationFailed(@NonNull FirebaseException e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onCodeSent(@NonNull String verificationId, @NonNull PhoneAuthProvider.ForceResendingToken token) {
            codesent = verificationId;

            Intent getotpintent = new Intent(Mobileno.this, Login.class);
            getotpintent.putExtra("verification code", codesent);
            startActivity(getotpintent);
            finish();

        }
    };
     */


}
