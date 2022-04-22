package com.example.a3hw31;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdressViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    public AdressViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
    }
    public void bind(String AdressValue){
        name.setText(AdressValue);

    }
}
