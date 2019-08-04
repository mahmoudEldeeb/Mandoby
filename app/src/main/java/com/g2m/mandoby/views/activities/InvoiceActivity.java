package com.g2m.mandoby.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.g2m.mandoby.R;
import com.g2m.mandoby.databinding.ActivityInvoiceBinding;
import com.g2m.mandoby.views.adapters.InvoiceAdapter;

public class InvoiceActivity extends AppCompatActivity {
ActivityInvoiceBinding invoiceBinding;
InvoiceAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        invoiceBinding= DataBindingUtil.setContentView(this,R.layout.activity_invoice);
        invoiceBinding.resInvoice.setLayoutManager(new LinearLayoutManager(this));
        adapter=new InvoiceAdapter(this);
        invoiceBinding.resInvoice.setAdapter(adapter);

    }
}
