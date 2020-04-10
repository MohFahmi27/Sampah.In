package com.example.mysampahin.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mysampahin.R;
import com.example.mysampahin.models.PostMsgNotif;
import com.example.mysampahin.rest.ApiInterface;
import com.google.android.gms.common.api.Api;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment implements View.OnClickListener {
    CircleImageView imgProfile;

    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_account, container, false);
        imgProfile = view.findViewById(R.id.profile_msg);
        imgProfile.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {

    }
}
