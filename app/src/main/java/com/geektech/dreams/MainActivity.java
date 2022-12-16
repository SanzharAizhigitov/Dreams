package com.geektech.dreams;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView dreamRV;
    private ArrayList<String> dreamList = new ArrayList<>();
    private DreamAdapter adapter = new DreamAdapter(dreamList);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dreamRV = findViewById(R.id.recycler_view);

        loadData();
        dreamRV.setAdapter(adapter);

    }
    private void loadData( ){
        dreamList.add("Деньги");
        dreamList.add("Здоровье и счастье семьи");
        dreamList.add("Здоровье и счастье семьи");
        dreamList.add("Здоровье и счастье семьи");
        dreamList.add("Здоровье и счастье семьи");
        dreamList.add("Здоровье и счастье семьи");
        dreamList.add("Здоровье и счастье семьи");
        dreamList.add("Здоровье и счастье семьи");
        dreamList.add("Здоровье и счастье семьи");
        dreamList.add("Здоровье и счастье семьи");
        dreamList.add("Здоровье и счастье семьи");
        dreamList.add("Здоровье и счастье семьи");
        dreamList.add("Здоровье и счастье семьи");
    }
}