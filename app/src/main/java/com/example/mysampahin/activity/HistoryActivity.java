package com.example.mysampahin.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mysampahin.R;
import com.example.mysampahin.adapter.HistoryAdapter;
import com.example.mysampahin.data.HistoryData;
import com.example.mysampahin.models.History;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    private RecyclerView rvHistory,rvHistorysep;
    private ArrayList<History> listHistory =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        rvHistory = findViewById(R.id.rv_history);
        rvHistory.setHasFixedSize(true);
        rvHistorysep = findViewById(R.id.rv_historysep);
        rvHistorysep.setHasFixedSize(true);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar);
        listHistory.addAll(HistoryData.getListDataTvshow());
        showRecyclerView();
        showRecyclerView2();
    }

    private void showRecyclerView() {
        rvHistory.setLayoutManager(new LinearLayoutManager(this));
        HistoryAdapter listListAdapter = new HistoryAdapter(this);
        listListAdapter.setListHistory(listHistory);
        rvHistory.setAdapter(listListAdapter);
    }

    private void showRecyclerView2() {
        rvHistorysep.setLayoutManager(new LinearLayoutManager(this));
        HistoryAdapter listAdapter = new HistoryAdapter(this);
        listAdapter.setListHistory(listHistory);
        rvHistorysep.setAdapter(listAdapter);
    }

}
