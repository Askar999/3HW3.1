package com.example.a3hw31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> adresses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.resycle);
        AdressAdapter adapter = new AdressAdapter(adresses);
        recyclerView.setAdapter(adapter);
    }
    private void loadData(){
        adresses = new ArrayList<>();
        adresses.add("aAdress-n");
        adresses.add("aAdress-n");
        adresses.add("aAdress-n");
        adresses.add("aAdress-n");
        adresses.add("aAdress-n");
        adresses.add("aAdress-n");
        adresses.add("aAdress-n");
        adresses.add("aAdress-n");
        adresses.add("aAdress-n");
        adresses.add("aAdress-n");
        adresses.add("aAdress-n");
        adresses.add("aAdress-n");
        adresses.add("aAdress-n");
        adresses.add("aAdress-n");
    }
}