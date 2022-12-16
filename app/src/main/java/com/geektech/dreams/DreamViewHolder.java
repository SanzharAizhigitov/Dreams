package com.geektech.dreams;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DreamViewHolder extends RecyclerView.ViewHolder {
    private TextView tvDreams;
    public DreamViewHolder(@NonNull View itemView) {
        super(itemView);
        tvDreams = itemView.findViewById(R.id.tv_dream);

    }
    public void bind(String contact){
        tvDreams.setText(contact);
    }
}
