package com.g2m.mandoby.views.fragments;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.g2m.mandoby.R;
import com.g2m.mandoby.databinding.FragmentMainBinding;
import com.g2m.mandoby.databinding.FragmentMainBindingImpl;

import com.g2m.mandoby.views.adapters.CatsAndComAdapter;
import com.g2m.mandoby.views.interf.MainFragmentListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements MainFragmentListener {
CatsAndComAdapter catsAndComAdapter;

    public MainFragment() {
        // Required empty public constructor
    }
    FragmentMainBinding binding;
    int i=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding= DataBindingUtil.inflate(
                inflater, R.layout.fragment_main, container, false);
        View view = binding.getRoot();
        binding.resCategory.setLayoutManager(new GridLayoutManager(getActivity(),2));
        catsAndComAdapter=new CatsAndComAdapter(getActivity());
        binding.resCategory.setAdapter(catsAndComAdapter);
        binding.setMainFragmentListener(MainFragment.this);
        if(i==0)
        binding.setType("الفئات");
        else binding.setType("الشركات");
        return view;

    }

    @Override
    public void onClick() {
        Log.v("aaaaa","ffvdfd") ;
        if(i==0)
        { binding.setType("الفئات");
        i=1;
        }
        else{ binding.setType("الشركات");
        i=0;
        }
        catsAndComAdapter.change();
    }
}
