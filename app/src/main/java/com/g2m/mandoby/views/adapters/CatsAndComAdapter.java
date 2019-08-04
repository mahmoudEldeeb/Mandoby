package com.g2m.mandoby.views.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.g2m.mandoby.R;
import com.g2m.mandoby.databinding.ItemCatsBinding;
import com.g2m.mandoby.models.datamodel.CatsAndComModel;
import com.g2m.mandoby.views.activities.ProductsActivity;
import com.g2m.mandoby.views.interf.MainFragmentListener;

import java.util.List;

public class CatsAndComAdapter  extends RecyclerView.Adapter<CatsAndComAdapter.ViewHolder> {
    List<Integer> list;
    Context context;
    CatsAndComModel catsAndComModel;
    int type=0;
    public CatsAndComAdapter(Context cxt) {
        context=cxt;
        change();

    }
    public void change(){
        if(type==0){
            catsAndComModel=new CatsAndComModel("البان",R.drawable.milk);
            type=1;
        }
        else {
            type=0;
            catsAndComModel = new CatsAndComModel("جهينة", R.drawable.logo_gm);
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CatsAndComAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemCatsBinding itemCatsBinding=
                DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_cats,
                viewGroup,false);
            ViewHolder viewHolder=new ViewHolder(itemCatsBinding);
            itemCatsBinding.setMainFragmentListener(viewHolder);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull CatsAndComAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.itemCatsBinding.setCatorcompany(catsAndComModel);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements MainFragmentListener {
        ItemCatsBinding itemCatsBinding;
        public ViewHolder(ItemCatsBinding itemview) {
            super(itemview.getRoot());
            itemCatsBinding=itemview;

        }

        @Override
        public void onClick() {
         Log.v("sssss",getAdapterPosition()+"    b");
            Intent intent=new Intent(context, ProductsActivity.class);
            context.startActivity(intent
            );
        }
    }
}