package com.example.pract3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ButterflyAdedpter extends RecyclerView.Adapter<ButterflyViewHolder> {
    private final LayoutInflater inflater;
    private final List<Butterfly> butterflyList;

    ButterflyAdedpter(Context context, List<Butterfly> butterflyList){
        this.butterflyList = butterflyList;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public ButterflyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recyclerview_item_layout, parent, false);
        view.setOnClickListener(e -> handleRecyclerItemClick((RecyclerView)parent, e));
        return new ButterflyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButterflyViewHolder holder, int position) {
        Butterfly butterfly = butterflyList.get(position);
        int res = this.getDrawableResIdByName(butterfly.getImageName());
        holder.butView.setImageResource(res);
        holder.nameView.setText(butterfly.getButName());
        holder.popuationView.setText("Популяция: " + butterfly.getPopulation());
    }

    private int getDrawableResIdByName(String imageName) {
        String pcgName = inflater.getContext().getPackageName();
        return inflater.getContext()
                .getResources()
                .getIdentifier(imageName, "drawable", pcgName);
    }

    @Override
    public int getItemCount() {
        return butterflyList.size();
    }

    public void handleRecyclerItemClick(RecyclerView view, View e){
        int itemPosition = view.getChildLayoutPosition(e);
        Butterfly butterfly = butterflyList.get(itemPosition);
        Toast.makeText(this.inflater.getContext(), butterfly.getButName(), Toast.LENGTH_SHORT).show();
    }
}
