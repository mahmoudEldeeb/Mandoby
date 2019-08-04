package com.g2m.mandoby.views.adapters;

import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.g2m.mandoby.BR;
import com.g2m.mandoby.R;
import com.g2m.mandoby.databinding.ItemCatsBinding;
import com.g2m.mandoby.databinding.ItemProductBinding;
import com.g2m.mandoby.databinding.ProductAmountBinding;
import com.g2m.mandoby.views.interf.MainFragmentListener;

import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {

    Context context;
    public ProductsAdapter(Context cxt) {
        context=cxt;
    }

    @NonNull
    @Override
    public ProductsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemProductBinding productBinding=DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
                R.layout.item_product,viewGroup,false);

        ProductsAdapter.ViewHolder viewHolder=new ProductsAdapter.ViewHolder(productBinding);
        productBinding.setMainFragmentListener(viewHolder);



        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull final ProductsAdapter.ViewHolder viewHolder, final int i) {

    }
    @Override
    public int getItemCount() {
        return 5;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements MainFragmentListener {
            ItemProductBinding productBinding;

        public ViewHolder(ItemProductBinding productBinding) {
            super(productBinding.getRoot());
            this.productBinding=productBinding;

        }

        @Override
        public void onClick() {
            getQantity();
        }
    }
    public void getQantity(){
        final AlertDialog quantityDialog = new AlertDialog.Builder(context).create();
        ProductAmountBinding amountBinding=
                DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.product_amount, null, false);
        AmountHandeler amountHandeler=new AmountHandeler(quantityDialog);
        amountBinding.setAmountHandeler(amountHandeler);
            quantityDialog.setView(amountBinding.getRoot());
        quantityDialog.setCanceledOnTouchOutside(false);
        quantityDialog.show();

    }

    public class AmountHandeler extends BaseObservable {
        public AlertDialog alertDialog;

        public String amount="1";
        @Bindable
        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
            notifyPropertyChanged(BR.amount);
        }
        /////////////
//////////////////////////////////
///////////////////////////////
        public AmountHandeler(AlertDialog ctx){
            alertDialog=ctx;
        }
        public void plus(){
            int am= Integer.parseInt(this.amount);
            am++;
            this.setAmount(am+"");
        }
        public void mins(){
            int am= Integer.parseInt(this.amount);
            am--;
            this.setAmount(am+"");
        }
        public void ok(){
            alertDialog.dismiss();
        }
        public void cancel(){
            alertDialog.dismiss();
        }
}
}
