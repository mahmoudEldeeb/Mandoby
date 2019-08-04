package com.g2m.mandoby.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.g2m.mandoby.R;
import com.g2m.mandoby.databinding.ActivityProductsBinding;
import com.g2m.mandoby.views.adapters.CatsAndComAdapter;
import com.g2m.mandoby.views.adapters.CompanyAdapter;
import com.g2m.mandoby.views.adapters.ProductsAdapter;

public class ProductsActivity extends AppCompatActivity {
ActivityProductsBinding productsBinding;
CompanyAdapter companyAdapter;
ProductsAdapter productsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        productsBinding= DataBindingUtil.setContentView(this,R.layout.activity_products);
        productsBinding.resCompanies.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL,false));

        productsBinding.resProducts.setLayoutManager(new LinearLayoutManager(this));
        companyAdapter=new CompanyAdapter(this);
        productsAdapter=new ProductsAdapter(this);

        productsBinding.resCompanies.setAdapter(companyAdapter);
        productsBinding.resProducts.setAdapter(productsAdapter);



    }
}
