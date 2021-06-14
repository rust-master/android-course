package com.mitiapps.loginapplecture1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mitiapps.loginapplecture1.Model.NewsFeedModel;
import com.mitiapps.loginapplecture1.ViewHolder.NewsFeedViewHolder;
import com.squareup.picasso.Picasso;

public class NewsFeedActivity extends AppCompatActivity {

    FirebaseDatabase db;
    DatabaseReference dbRef;

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    FirebaseRecyclerAdapter<NewsFeedModel, NewsFeedViewHolder> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed);

        db =  FirebaseDatabase.getInstance();
        dbRef = db.getReference("NewsFeed");

        recyclerView =  findViewById(R.id.recyclerViewNewsFeed);
        layoutManager = new LinearLayoutManager(this);
        //layoutManager.setReverseLayout(true);
        //layoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(layoutManager);

        
        loadData();

    }

    private void loadData() {
        adapter = new FirebaseRecyclerAdapter<NewsFeedModel, NewsFeedViewHolder>(
                NewsFeedModel.class,
                R.layout.news_feed_layout,
                NewsFeedViewHolder.class,
                dbRef
        ) {
            @Override
            protected void populateViewHolder(NewsFeedViewHolder viewHolder, NewsFeedModel model, int position) {

                Picasso.with(getApplicationContext()).load(model.getImage()).into(viewHolder.imageView);
            }
        };
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
    }
}