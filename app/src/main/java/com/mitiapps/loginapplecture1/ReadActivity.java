package com.mitiapps.loginapplecture1;

import android.os.Bundle;
import android.widget.ImageView;
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
import com.squareup.picasso.Picasso;

public class ReadActivity extends AppCompatActivity {

    TextView name, email;
    ImageView imagView,imagView1;
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
        imagView = findViewById(R.id.imagView);
        imagView1 = findViewById(R.id.imagView1);

        loadData();
    }

    private void loadData() {
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                UsersInfoModel model = snapshot.getValue(UsersInfoModel.class);

                name.setText(model.getName());
                email.setText(model.getEmail());

                Picasso.with(getApplicationContext()).load(model.getImage()).into(imagView);
                Picasso.with(getApplicationContext()).load(model.getImg()).into(imagView1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}