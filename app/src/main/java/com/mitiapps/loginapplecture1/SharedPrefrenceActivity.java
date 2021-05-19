package com.mitiapps.loginapplecture1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SharedPrefrenceActivity extends AppCompatActivity {

    EditText edtEmail,edtName;
    Button btnShared,btnShow;
    TextView tvEmail,tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_prefrence);

        // find views / connection to widgets
        edtEmail = findViewById(R.id.edtEmail);
        edtName = findViewById(R.id.edtName);
        btnShared = findViewById(R.id.btnShared);
        tvEmail = findViewById(R.id.tvEmail);
        tvName = findViewById(R.id.tvName);
        btnShow = findViewById(R.id.btnShow);
        btnShared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtEmail.getText().toString();
                String name = edtName.getText().toString();

                SharedPreferences preferences = getSharedPreferences("Lecture7",MODE_PRIVATE);
                SharedPreferences.Editor editor =  preferences.edit();
                editor.putString("Email",email);
                editor.putString("Name",name);
                editor.apply();

            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("Lecture7",MODE_PRIVATE);
                String email = preferences.getString("Email","");
                String name = preferences.getString("Name","");
                tvEmail.setText(email);
                tvName.setText(name);
            }
        });


    }
}