package com.example.mysampahin.activity;

import android.os.Bundle;

import com.example.mysampahin.R;
import com.example.mysampahin.fragment.AccountFragment;
import com.example.mysampahin.fragment.HomeFragment;
import com.example.mysampahin.fragment.ScanQRFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment = new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
                case R.id.navigation_scanqr:
                    fragment = new ScanQRFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
                case R.id.navigation_account:
                    fragment = new AccountFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar);

        if (savedInstanceState == null) {
            navView.setSelectedItemId(R.id.navigation_home);
        }

    }

}
