package com.mitiapps.loginapplecture1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mitiapps.loginapplecture1.Model.UsersInfoModel;

public class FirebaseAuthActivity extends AppCompatActivity {

    EditText edtEmail,edtName,edtPassword;
    Button btnSignUp;
    FirebaseAuth auth;

    DatabaseReference reference;
    FirebaseDatabase database;
    String Uid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_auth);

        auth = FirebaseAuth.getInstance();

        database = FirebaseDatabase.getInstance();
        reference = database.getReference("Users");

        edtEmail = findViewById(R.id.edtEmail);
        edtName = findViewById(R.id.edtName);
        edtPassword = findViewById(R.id.edtPassword);
        btnSignUp = findViewById(R.id.btnSignup);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtEmail.getText().toString();
                String name = edtName.getText().toString();
                String password = edtPassword.getText().toString();

                auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            // Insert Code
                            Uid = auth.getCurrentUser().getUid();
                            UsersInfoModel model = new UsersInfoModel(email,name);
                            reference.child(Uid).setValue(model);

                            Toast.makeText(FirebaseAuthActivity.this, "Signup Success", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(FirebaseAuthActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}