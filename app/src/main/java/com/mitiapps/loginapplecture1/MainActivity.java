package com.mitiapps.loginapplecture1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edtUsername, edtPassword;

    String DefaultUsername = "Zaryab";
    String DefaultPassword = "12345";

    RadioButton btnmale,btnFemale;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String addTimeString = intent.getStringExtra("addTime");
        long addtime = Long.parseLong(addTimeString);
        addtime = TimeUnit.MINUTES.toMillis(addtime);



        // find ids
        btnLogin = findViewById(R.id.BtnLogin);
        edtUsername = findViewById(R.id.username);
        edtPassword = findViewById(R.id.password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();
                if(DefaultUsername.equals(username) && DefaultPassword.equals(password))
                {
                    Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });


        // connection

        btnFemale =  findViewById(R.id.rdfemale);
        btnmale  = findViewById(R.id.rdmale);
        check = findViewById(R.id.btnCheck);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnFemale.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Female Checked " , Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Male Checked " , Toast.LENGTH_SHORT).show();
                }
            }
        });


        new CountDownTimer(addtime   , 1000){
            public void onTick(long millisUntilFinished){

            }
            public  void onFinish(){
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        }.start();

    }
}