package com.example.mysampahin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.mysampahin.R;
import com.example.mysampahin.models.History;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder> {

    private Context context;
    private ArrayList<History> listHistory;

    public HistoryAdapter(Context context) {
        this.context = context;
    }

    public void setListHistory(ArrayList<History> listHistory) {
        this.listHistory = listHistory;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_history_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        History history = listHistory.get(position);

        Glide.with(holder.itemView.getContext())
                .load(history.getImgSampah())
                .apply(new RequestOptions().override(600,650))
                .into(holder.imgSampah);
        holder.tvNamaSampah.setText(history.getJenisSampah());
        holder.tvTglHistory.setText(history.getTglTransaksi());
        holder.tvwaktuHistory.setText(history.getWaktuSampah());
    }

    @Override
    public int getItemCount() {
        return listHistory.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgSampah;
        TextView tvTglHistory, tvNamaSampah, tvwaktuHistory;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgSampah = itemView.findViewById(R.id.img_history);
            tvTglHistory = itemView.findViewById(R.id.tv_tanggal_history);
            tvNamaSampah = itemView.findViewById(R.id.tv_history_tittle);
            tvwaktuHistory = itemView.findViewById(R.id.tv_waktu);

        }
    }
}
