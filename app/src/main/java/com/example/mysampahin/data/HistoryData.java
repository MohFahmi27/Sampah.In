package com.example.mysampahin.data;

import com.example.mysampahin.models.History;

import java.util.ArrayList;

public class HistoryData {
    public static String[][] HistoryshowData = new String[][] {
            {
                    "04",
                    "Membuang Plastik",
                    "12:00 WITA",
                    "https://img.icons8.com/dusk/256/000000/water-bottle.png",
            },
            {
                    "05",
                    "Membuang Plastik",
                    "12:00 WITA",
                    "https://img.icons8.com/dusk/256/000000/water-bottle.png",
            },
            {
                    "07",
                    "Membuang Plastik",
                    "12:00 WITA",
                    "https://img.icons8.com/dusk/256/000000/water-bottle.png",
            },
            {
                    "20",
                    "Membuang Plastik",
                    "12:00 WITA",
                    "https://img.icons8.com/dusk/256/000000/water-bottle.png",
            },
            {
                    "21",
                    "Membuang Plastik",
                    "12:00 WITA",
                    "https://img.icons8.com/dusk/256/000000/water-bottle.png",
            },
    };
    public static ArrayList<History> getListDataTvshow() {
        ArrayList<History> list = new ArrayList<>();
        for (String[] Data : HistoryshowData) {
            History history = new History();
            history.setTglTransaksi(Data[0]);
            history.setJenisSampah(Data[1]);
            history.setWaktuSampah(Data[2]);
            history.setImgSampah(Data[3]);

            list.add(history);
        }
        return list;
    }
}
