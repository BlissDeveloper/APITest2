package com.example.apitest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbarbarPosts;
    private RecyclerView recyclerViewPosts;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbarbarPosts = findViewById(R.id.toolbarPosts);
        recyclerViewPosts = findViewById(R.id.recyclerViewPosts);

        linearLayoutManager = new LinearLayoutManager(MainActivity.this, RecyclerView.VERTICAL, false);
        recyclerViewPosts.setLayoutManager(linearLayoutManager);

        setSupportActionBar(toolbarbarPosts);
        getSupportActionBar().setTitle("Posts");
    }
}
