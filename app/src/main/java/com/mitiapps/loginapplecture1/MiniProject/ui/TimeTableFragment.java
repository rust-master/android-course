package com.mitiapps.loginapplecture1.MiniProject.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.mitiapps.loginapplecture1.MiniProject.TimeTableData;
import com.mitiapps.loginapplecture1.R;


public class TimeTableFragment extends Fragment {

    View rootView;
    Spinner spinner1,spinner2,spinner3;
    CardView btnShowCard;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_time_table, container, false);
        spinner1 = rootView.findViewById(R.id.spinner1);
        spinner2 = rootView.findViewById(R.id.spinner2);
        spinner3 = rootView.findViewById(R.id.spinner3);
        btnShowCard = rootView.findViewById(R.id.btnShowCard);

        spinner1.setAdapter(new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_dropdown_item, TimeTableData.departments));
        spinner2.setAdapter(new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_dropdown_item, TimeTableData.batches));
        spinner3.setAdapter(new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_dropdown_item, TimeTableData.days));


        btnShowCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dep = TimeTableData.departments[spinner1.getSelectedItemPosition()];
                String batch = TimeTableData.batches[spinner2.getSelectedItemPosition()];
                String day = TimeTableData.days[spinner3.getSelectedItemPosition()];

                Toast.makeText(getActivity(), " " + dep + " " + batch + " " + day, Toast.LENGTH_SHORT).show();

            }
        });


        return rootView;
    }
}