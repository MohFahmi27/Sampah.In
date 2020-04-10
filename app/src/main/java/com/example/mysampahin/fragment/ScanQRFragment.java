package com.example.mysampahin.fragment;


import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mysampahin.R;
import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScanQRFragment extends Fragment implements ZXingScannerView.ResultHandler {
    private ZXingScannerView mscannerView;

    public ScanQRFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_scan_qr, container, false);
        mscannerView = view.findViewById(R.id.scanner);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mscannerView.setResultHandler(this);
        mscannerView.startCamera();
    }

    @Override
    public void onPause() {
        super.onPause();
        mscannerView.setResultHandler(this);
        mscannerView.stopCamera();
    }

    @Override
    public void handleResult(Result result) {
        Log.v("TAG", result.getText());
        Log.v("TAG", result.getBarcodeFormat().toString());
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
        builder.setTitle(" Scan Success");
        builder.setMessage(result.getText());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        mscannerView.resumeCameraPreview(this);
    }
}
