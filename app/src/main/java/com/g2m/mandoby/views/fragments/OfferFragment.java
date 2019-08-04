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
import com.g2m.mandoby.databinding.FragmentOfferBinding;
import com.g2m.mandoby.views.adapters.OfferAdapter;
import com.g2m.mandoby.views.adapters.OrderHistoryAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class OfferFragment extends Fragment {


    public OfferFragment() {
        // Required empty public constructor
    }
FragmentOfferBinding offerBinding;
    OfferAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      offerBinding=  DataBindingUtil.inflate(
                inflater, R.layout.fragment_offer, container, false);
        View view = offerBinding.getRoot();
        adapter=new OfferAdapter(getActivity());
        Log.v("aaaaa","dfddddddd");
        offerBinding.resOffers.setLayoutManager(new LinearLayoutManager(getActivity()));
        offerBinding.resOffers.setAdapter(adapter);

        return view;

    }

}
