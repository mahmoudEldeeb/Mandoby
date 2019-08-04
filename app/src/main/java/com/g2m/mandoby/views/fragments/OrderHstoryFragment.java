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
import com.g2m.mandoby.databinding.FragmentOrderHstoryBinding;
import com.g2m.mandoby.views.adapters.OrderHistoryAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderHstoryFragment extends Fragment {


    public OrderHstoryFragment() {
        // Required empty public constructor
    }

FragmentOrderHstoryBinding orderHstoryBinding;
    OrderHistoryAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      orderHstoryBinding  = DataBindingUtil.inflate(
                inflater, R.layout.fragment_order_hstory, container, false);
        View view = orderHstoryBinding.getRoot();
        adapter=new OrderHistoryAdapter(getActivity());
        Log.v("aaaaa","dfddddddd");
        orderHstoryBinding.resOrderHistory.setLayoutManager(new LinearLayoutManager(getActivity()));
        orderHstoryBinding.resOrderHistory.setAdapter(adapter);

        return view;
    }

}
