package com.lenivenko.aleksandr.gridlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class SizeViewHolder extends RecyclerView.ViewHolder {

    public final TextView sizeTextView;

    public SizeViewHolder(View itemView) {
        super(itemView);
        sizeTextView = itemView.findViewById(R.id.tv_size);
    }
}
