package com.mitiapps.loginapplecture1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mitiapps.loginapplecture1.Adapter.MyListAdapter;
import com.mitiapps.loginapplecture1.ListData.MyListData;

public class RecyclerViewActivity extends AppCompatActivity {

    MyListAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = findViewById(R.id.recyclerView);

        MyListData[] myListData = new MyListData[]{
                new MyListData("Zaryab",R.drawable.download),
                new MyListData("Ganachee",R.drawable.download),
                new MyListData("Truffle",R.drawable.download),
                new MyListData("Ganachee",R.drawable.download),
                new MyListData("Truffle",R.drawable.download),
                new MyListData("Android",R.drawable.download),
                new MyListData("Truffle",R.drawable.download),
                new MyListData("Ganachee",R.drawable.download),
                new MyListData("Truffle",R.drawable.download),
                new MyListData("Zaryab",R.drawable.download),
                new MyListData("Truffle",R.drawable.download),
                new MyListData("Lecture 9",R.drawable.download),
                new MyListData("Android",R.drawable.download),
                new MyListData("Ganachee",R.drawable.download),
                new MyListData("App Dev",R.drawable.download),
        };
        adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}