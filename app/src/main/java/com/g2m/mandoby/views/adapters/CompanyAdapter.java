package com.g2m.mandoby.views.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.g2m.mandoby.R;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.ViewHolder> {

        Context context;
public CompanyAdapter(Context cxt) {
        context=cxt;
        }

@NonNull
@Override
public CompanyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    CompanyAdapter.ViewHolder viewHolder;
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_text, viewGroup, false);
        viewHolder = new CompanyAdapter.ViewHolder(view);
        return viewHolder;
        }


@Override
public void onBindViewHolder(@NonNull CompanyAdapter.ViewHolder viewHolder, final int i) {

        }
@Override
public int getItemCount() {
        return 5;
        }


public class ViewHolder extends RecyclerView.ViewHolder {


    public ViewHolder(View v) {
        super(v);

    }

}
}
