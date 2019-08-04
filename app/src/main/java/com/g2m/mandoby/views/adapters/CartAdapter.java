package com.g2m.mandoby.views.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.g2m.mandoby.R;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {

    Context context;
    public CartAdapter(Context cxt) {
        context=cxt;
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        CartAdapter.ViewHolder viewHolder;
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cart, viewGroup, false);
        viewHolder = new CartAdapter.ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder viewHolder, final int i) {

    }
    @Override
    public int getItemCount() {
        return 10;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        public ViewHolder(View v) {
            super(v);

        }
        @Override
        public void onClick(View view) {

        }
    }
}

