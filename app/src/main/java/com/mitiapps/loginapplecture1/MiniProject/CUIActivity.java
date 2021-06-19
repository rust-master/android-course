package com.mitiapps.loginapplecture1.MiniProject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mitiapps.loginapplecture1.MiniProject.ui.CUOnlineFragment;
import com.mitiapps.loginapplecture1.MiniProject.ui.NewsFeedFragment;
import com.mitiapps.loginapplecture1.MiniProject.ui.TimeTableFragment;
import com.mitiapps.loginapplecture1.R;

public class CUIActivity extends AppCompatActivity {

    BottomNavigationView bottom_nav;
    ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_u_i2);
        toolbar = getSupportActionBar();
        toolbar.setTitle("News Feed");

        updateFragment(new NewsFeedFragment());

        bottom_nav = findViewById(R.id.bottom_nav);

        bottom_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                if(item.getItemId() == R.id.newsFeed){
                    fragment = new NewsFeedFragment();
                    toolbar.setTitle("News Feed");
                    updateFragment(fragment);
                }
                else if(item.getItemId() == R.id.cuOnline){
                    fragment = new CUOnlineFragment();
                    toolbar.setTitle("CU Online");
                    updateFragment(fragment);
                }
                else if(item.getItemId() == R.id.timeTable){
                    fragment = new TimeTableFragment();
                    toolbar.setTitle("Time Table");
                    updateFragment(fragment);
                }
                return false;
            }
        });
    }

    void updateFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.commit();
    }
}