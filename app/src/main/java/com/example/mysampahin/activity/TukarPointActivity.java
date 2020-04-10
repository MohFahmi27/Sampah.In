package com.example.mysampahin.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.mysampahin.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class TukarPointActivity extends AppCompatActivity {

    CarouselView carouselView;
    int[] sampleImage = {R.drawable.imagecarouselone, R.drawable.imagecarouselone, R.drawable.imagecarouselone};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tukar_point);

        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImage.length);
        carouselView.setImageListener(imageListener);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar);

    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImage[position]);
        }
    };
}
