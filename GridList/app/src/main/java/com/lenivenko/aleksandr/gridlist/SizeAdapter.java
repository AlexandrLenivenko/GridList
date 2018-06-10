package com.lenivenko.aleksandr.gridlist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

class SizeAdapter extends RecyclerView.Adapter<SizeViewHolder> {
    private int items;
    private List<? extends RowItem> list;


    @NonNull
    @Override
    public SizeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SizeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_size, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SizeViewHolder holder, int position) {
        SizeModel item = (SizeModel) getItem(position);
        holder.sizeTextView.setText(item.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setList(@NonNull List<? extends RowItem> list) {
        this.list = list;
    }

    public List<? extends RowItem> getItems() {
        return list;
    }

    public RowItem getItem(int position) {
        return list.get(position);
    }
}
