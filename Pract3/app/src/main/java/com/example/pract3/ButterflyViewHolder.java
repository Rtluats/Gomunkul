package com.example.pract3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ButterflyViewHolder extends RecyclerView.ViewHolder {
    final ImageView butView;
    final TextView nameView;
    final TextView popuationView;

    public ButterflyViewHolder(@NonNull View itemView) {
        super(itemView);
        butView = (ImageView) itemView.findViewById(R.id.imageView);
        nameView = (TextView) itemView.findViewById(R.id.textView_butName);
        popuationView = (TextView) itemView.findViewById(R.id.textView_population);

    }
}
