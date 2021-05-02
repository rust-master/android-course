package com.mitiapps.loginapplecture1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText edtEmail,edtName,edtPassword;
    Button btnSignUp,btnWhatsApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // find views / connection to widgets
        edtEmail = findViewById(R.id.edtEmail);
        edtName = findViewById(R.id.edtName);
        edtPassword = findViewById(R.id.edtPassword);
        btnSignUp = findViewById(R.id.btnSignup);
        btnWhatsApp = findViewById(R.id.btnWhatsApp);


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Boolean check = inputValidation();

                if(check){
                    String email =  edtEmail.getText().toString();
                    String name =  edtName.getText().toString();
                    String pass =  edtPassword.getText().toString();

                    Toast.makeText(SignUpActivity.this, "Email : "+email+"\n name : " +name+"\n Password: "+ pass, Toast.LENGTH_LONG).show();

                    // Explicit Intent
                    Intent intent = new Intent(SignUpActivity.this,HomeActivity.class);
                    intent.putExtra("Email",email);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }




            }
        });

        btnWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Hi Android");
                sendIntent.setPackage("com.whatsapp");
                startActivity(sendIntent);
            }
        });
    }

    private Boolean inputValidation() {
        String email =  edtEmail.getText().toString().trim();
        String name =  edtName.getText().toString().trim();
        String pass =  edtPassword.getText().toString().trim();
        if(email.isEmpty()){
            edtEmail.setError("Please Enter Email!");
            edtEmail.requestFocus();
            return false;
        }
        if(name.isEmpty()){
            edtName.setError("Please Enter Name!");
            edtName.requestFocus();
            return false;
        }
        if(pass.isEmpty()){
            edtPassword.setError("Please Enter Password!");
            edtPassword.requestFocus();
            return false;
        }
    return true;
    }


}