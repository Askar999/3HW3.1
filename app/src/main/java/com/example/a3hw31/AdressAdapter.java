package com.example.a3hw31;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdressAdapter extends RecyclerView.Adapter <AdressViewHolder> {
    private ArrayList<String> data;
    public AdressAdapter(ArrayList<String>data){
        this.data = data;
    }
    @NonNull
    @Override
    public AdressViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdressViewHolder(LayoutInflater.from
                (parent.getContext()).inflate(R.layout.
                item_adress, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdressViewHolder holder, int position) {
    holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
