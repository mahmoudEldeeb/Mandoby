package com.g2m.mandoby.views.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.g2m.mandoby.R;
import com.g2m.mandoby.databinding.ItemOfferBinding;
import com.g2m.mandoby.databinding.ItemPointsBinding;
import com.g2m.mandoby.models.datamodel.CatsAndComModel;
import com.g2m.mandoby.views.activities.InvoiceActivity;
import com.g2m.mandoby.views.interf.MainFragmentListener;

import java.util.List;

public class PointsAdapter extends RecyclerView.Adapter<PointsAdapter.ViewHolder> {
    List<Integer> list;
    Context context;
    CatsAndComModel catsAndComModel;
    int type=0;
    public PointsAdapter(Context cxt) {
        context=cxt;


    }

    @NonNull
    @Override
    public PointsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemPointsBinding itemCatsBinding=
                DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_points,
                viewGroup,false);
            ViewHolder viewHolder=new ViewHolder(itemCatsBinding);
            itemCatsBinding.setMainFragmentListener(viewHolder);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull PointsAdapter.ViewHolder viewHolder, final int i) {
      //  viewHolder.itemCatsBinding.setCatorcompany(catsAndComModel);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements MainFragmentListener {
        ItemPointsBinding itemCatsBinding;
        public ViewHolder(ItemPointsBinding itemview) {
            super(itemview.getRoot());
            itemCatsBinding=itemview;

        }
        @Override
        public void onClick() {
         Log.v("sssss",getAdapterPosition()+"    b");
            Intent intent=new Intent(context, InvoiceActivity.class);
            context.startActivity(intent);
        }
    }
}