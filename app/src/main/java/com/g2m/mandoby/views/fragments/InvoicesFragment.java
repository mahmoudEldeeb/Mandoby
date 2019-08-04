package com.g2m.mandoby.views.fragments;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.g2m.mandoby.R;
import com.g2m.mandoby.databinding.FragmentInvoicesBinding;
import com.g2m.mandoby.views.adapters.OrderHistoryAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class InvoicesFragment extends Fragment {


    public InvoicesFragment() {
        // Required empty public constructor
    }

FragmentInvoicesBinding invoicesBinding;
    OrderHistoryAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        invoicesBinding  = DataBindingUtil.inflate(
                inflater, R.layout.fragment_invoices, container, false);
        View view = invoicesBinding.getRoot();
        adapter=new OrderHistoryAdapter(getActivity());
        Log.v("aaaaa","dfddddddd");
        invoicesBinding.resInvoices.setLayoutManager(new LinearLayoutManager(getActivity()));
        invoicesBinding.resInvoices.setAdapter(adapter);
return view;
    }

}
