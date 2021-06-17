package com.mitiapps.loginapplecture1.MiniProject.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.mitiapps.loginapplecture1.R;

public class CUOnlineFragment extends Fragment {


    View rootView;
    WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_c_u_online, container, false);

        webView = rootView.findViewById(R.id.webView);
        webView.loadUrl("https://swl-cms.comsats.edu.pk:8082/");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return rootView;
    }
}