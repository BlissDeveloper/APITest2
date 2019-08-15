package com.example.apitest2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostViewHolder extends RecyclerView.ViewHolder{
    public TextView textViewTitle;
    public TextView textViewBody;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
