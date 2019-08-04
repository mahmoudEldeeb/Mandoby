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
import com.g2m.mandoby.databinding.ItemCatsBinding;
import com.g2m.mandoby.databinding.ItemOrderHistoryBinding;
import com.g2m.mandoby.models.datamodel.CatsAndComModel;
import com.g2m.mandoby.views.activities.InvoiceActivity;
import com.g2m.mandoby.views.activities.ProductsActivity;
import com.g2m.mandoby.views.interf.MainFragmentListener;

import java.util.List;

public class OrderHistoryAdapter extends RecyclerView.Adapter<OrderHistoryAdapter.ViewHolder> {
    List<Integer> list;
    Context context;
    CatsAndComModel catsAndComModel;
    int type=0;
    public OrderHistoryAdapter(Context cxt) {
        context=cxt;


    }

    @NonNull
    @Override
    public OrderHistoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemOrderHistoryBinding itemCatsBinding=
                DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_order_history,
                viewGroup,false);
            ViewHolder viewHolder=new ViewHolder(itemCatsBinding);
            itemCatsBinding.setMainFragmentListener(viewHolder);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull OrderHistoryAdapter.ViewHolder viewHolder, final int i) {
      //  viewHolder.itemCatsBinding.setCatorcompany(catsAndComModel);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements MainFragmentListener {
        ItemOrderHistoryBinding itemCatsBinding;
        public ViewHolder(ItemOrderHistoryBinding itemview) {
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