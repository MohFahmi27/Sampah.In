package com.example.mysampahin.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.mysampahin.R;
import com.example.mysampahin.activity.DropPointActivity;
import com.example.mysampahin.activity.HistoryActivity;
import com.example.mysampahin.activity.MainActivity;
import com.example.mysampahin.activity.TukarPointActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {
    private ImageButton btnHistory;
    private ImageButton btnTukarPoint;
    private ImageButton btnDropPoint;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        btnDropPoint = view.findViewById(R.id.btndrop_point);
        btnHistory = view.findViewById(R.id.btnhistory);
        btnTukarPoint = view.findViewById(R.id.btntukar_point);

        btnTukarPoint.setOnClickListener(this);
        btnDropPoint.setOnClickListener(this);
        btnHistory.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btndrop_point :
                Intent intent = new Intent(this.getContext(), DropPointActivity.class);
                startActivity(intent);
                break;
            case R.id.btnhistory :
                Intent hiintent = new Intent(this.getContext(), HistoryActivity.class);
                startActivity(hiintent);
                break;
            case R.id.btntukar_point :
                Intent tuintent = new Intent(this.getContext(), TukarPointActivity.class);
                startActivity(tuintent);
                break;
        }
    }
}
