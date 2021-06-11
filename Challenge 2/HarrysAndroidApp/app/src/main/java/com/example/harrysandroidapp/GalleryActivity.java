package com.example.harrysandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        if(getIntent().hasExtra("image_url")){
            int imageUrl = getIntent().getIntExtra("image_url", R.drawable.ic_launcher_background);
            setImage(imageUrl);
        }
    }

    private void setImage(int imageUrl){
        ImageView image = findViewById(R.id.imageView);
        image.setImageResource(imageUrl);
    }

}