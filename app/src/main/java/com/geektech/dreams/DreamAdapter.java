package com.geektech.dreams;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DreamAdapter extends RecyclerView.Adapter<DreamViewHolder> {
    private ArrayList<String> dreams;

    public DreamAdapter(ArrayList<String> dreams) {
        this.dreams = dreams;
    }

    @NonNull
    @Override
    public DreamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DreamViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dream, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DreamViewHolder holder, int position) {
holder.bind(dreams.get(position));
    }

    @Override
    public int getItemCount() {
        return dreams.size();
    }
}
