package com.g2m.mandoby.views.fragments;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.g2m.mandoby.R;
import com.g2m.mandoby.databinding.FragmentPointsBinding;
import com.g2m.mandoby.views.adapters.PointsAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class PointsFragment extends Fragment {


    public PointsFragment() {
        // Required empty public constructor
    }
FragmentPointsBinding pointsBinding;
    PointsAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        pointsBinding= DataBindingUtil.inflate(inflater,
                R.layout.fragment_points,container,false);
        View view=pointsBinding.getRoot();
        adapter=new PointsAdapter(getActivity());
        pointsBinding.resPoints.setLayoutManager(new LinearLayoutManager(getActivity()));
        pointsBinding.resPoints.setAdapter(adapter);

        return view;

    }

}
