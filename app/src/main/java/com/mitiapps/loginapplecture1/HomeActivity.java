package com.mitiapps.loginapplecture1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView tvEmail,tvName;

    Button btnSetTime;
    EditText edttime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // find id
        tvEmail = findViewById(R.id.email);
        tvName = findViewById(R.id.name);

        Intent intent = getIntent();
        String email = intent.getStringExtra("Email");
        String name = intent.getStringExtra("name");

        tvEmail.setText(email);
        tvName.setText(name);

        btnSetTime = findViewById(R.id.setTimer);
        edttime = findViewById(R.id.addTime);

        btnSetTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String addTime = edttime.getText().toString();
                Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                intent.putExtra("addTime",addTime);
                startActivity(intent);
                finish();
            }
        });


    }
}