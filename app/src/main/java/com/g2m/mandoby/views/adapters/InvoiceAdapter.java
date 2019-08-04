package com.g2m.mandoby.views.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.g2m.mandoby.R;
import com.g2m.mandoby.databinding.ItemInvoiceBinding;
import com.g2m.mandoby.databinding.ItemOrderHistoryBinding;
import com.g2m.mandoby.models.datamodel.CatsAndComModel;
import com.g2m.mandoby.views.interf.MainFragmentListener;

import java.util.List;

public class InvoiceAdapter extends RecyclerView.Adapter<InvoiceAdapter.ViewHolder> {
    List<Integer> list;
    Context context;
    CatsAndComModel catsAndComModel;
    int type=0;
    public InvoiceAdapter(Context cxt) {
        context=cxt;


    }

    @NonNull
    @Override
    public InvoiceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemInvoiceBinding itemCatsBinding=
                DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_invoice,
                viewGroup,false);
            ViewHolder viewHolder=new ViewHolder(itemCatsBinding);
            itemCatsBinding.setMainFragmentListener(viewHolder);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull InvoiceAdapter.ViewHolder viewHolder, final int i) {
      //  viewHolder.itemCatsBinding.setCatorcompany(catsAndComModel);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements MainFragmentListener {
        ItemInvoiceBinding itemCatsBinding;
        public ViewHolder(ItemInvoiceBinding itemview) {
            super(itemview.getRoot());
            itemCatsBinding=itemview;

        }
        @Override
        public void onClick() {
         Log.v("sssss",getAdapterPosition()+"    b");
          //  Intent intent=new Intent(context, ProductsActivity.class);
           // context.startActivity(intent
        }
    }
}