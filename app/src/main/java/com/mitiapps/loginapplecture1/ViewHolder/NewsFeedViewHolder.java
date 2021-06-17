package com.mitiapps.loginapplecture1.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mitiapps.loginapplecture1.R;

public class NewsFeedViewHolder  extends RecyclerView.ViewHolder  {

    public ImageView imageView;
    public TextView newsText;

    public NewsFeedViewHolder(@NonNull View itemView) {
        super(itemView);
         imageView = itemView.findViewById(R.id.imageNews);
        newsText = itemView.findViewById(R.id.newsText);
    }
}
