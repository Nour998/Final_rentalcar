package com.exemple.final_rentalcar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Page2 extends AppCompatActivity {
    private RecyclerView.Adapter MyAdapter;
    private  RecyclerView recyclerView;

    String b[];
    int[] images ={R.drawable.bm,R.drawable.bmm,R.drawable.car,
            R.drawable.kia,R.drawable.kiaa,R.drawable.kiaaa,
            R.drawable.tesla,R.drawable.bmm,R.drawable.car,R.drawable.bm,R.drawable.bmm,R.drawable.car,
            R.drawable.kia,R.drawable.kiaa,R.drawable.kiaaa,
            R.drawable.tesla,R.drawable.bmm,R.drawable.car,
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        b = getResources().getStringArray(R.array.car);

        MyAdapter myAdapter = new MyAdapter(this, b, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    }
