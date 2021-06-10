package com.mitiapps.loginapplecture1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.mitiapps.loginapplecture1.Model.UsersInfoModel;

public class ReadActivity extends AppCompatActivity {

    TextView name, email;
    FirebaseDatabase database;
    DatabaseReference reference;
    FirebaseAuth auth;
    String uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        
        auth = FirebaseAuth.getInstance();
        uid= auth.getCurrentUser().getUid();
        
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("Users").child(uid);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        
        loadData();
    }

    private void loadData() {
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                UsersInfoModel model = snapshot.getValue(UsersInfoModel.class);

                name.setText(model.getName());
                email.setText(model.getEmail());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}