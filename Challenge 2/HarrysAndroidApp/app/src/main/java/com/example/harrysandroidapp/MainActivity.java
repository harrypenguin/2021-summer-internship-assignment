package com.example.harrysandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Harry Peng 2021

    MyRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // populating the RecyclerView with image url data
        ArrayList<Integer> pictures = new ArrayList<>();
        pictures.add(R.drawable.pic1);
        pictures.add(R.drawable.pic2);
        pictures.add(R.drawable.pic3);
        pictures.add(R.drawable.pic4);
        pictures.add(R.drawable.pic5);

        // setting up the Adapter
        RecyclerView recyclerView = findViewById(R.id.myRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, pictures);

        recyclerView.setAdapter(adapter);
        }
}