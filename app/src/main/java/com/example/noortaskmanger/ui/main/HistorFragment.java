package com.example.noortaskmanger.ui.main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.noortaskmanger.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistorFragment extends Fragment {


    public HistorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_histor, container, false);
    }

}
