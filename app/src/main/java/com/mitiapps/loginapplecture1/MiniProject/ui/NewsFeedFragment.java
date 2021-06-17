package com.mitiapps.loginapplecture1.MiniProject.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mitiapps.loginapplecture1.Model.NewsFeedModel;
import com.mitiapps.loginapplecture1.R;
import com.mitiapps.loginapplecture1.ViewHolder.NewsFeedViewHolder;
import com.squareup.picasso.Picasso;

public class NewsFeedFragment extends Fragment {
    
    View rootView;

    FirebaseDatabase db;
    DatabaseReference dbRef;

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    FirebaseRecyclerAdapter<NewsFeedModel, NewsFeedViewHolder> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView =  inflater.inflate(R.layout.fragment_news_feed2, container, false);


        db =  FirebaseDatabase.getInstance();
        dbRef = db.getReference("NewsFeed");

        recyclerView = rootView.findViewById(R.id.newsFeedFrgRecler);
        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(layoutManager);


        loadNewsFeed();


        return rootView;
    }

    private void loadNewsFeed() {
        adapter = new FirebaseRecyclerAdapter<NewsFeedModel, NewsFeedViewHolder>(
                NewsFeedModel.class,
                R.layout.news_feed_layout,
                NewsFeedViewHolder.class,
                dbRef
        ) {
            @Override
            protected void populateViewHolder(NewsFeedViewHolder viewHolder, NewsFeedModel model, int position) {

                Picasso.with(getContext()).load(model.getImage()).into(viewHolder.imageView);
                viewHolder.newsText.setText(model.getNewstext());
            }
        };
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
    }
}