package com.hu.tyler.leetcode;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.hu.tyler.leetcode.MainActivity.adapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class CodeList extends Fragment {

    public static RecyclerView CodeListing ;
    public Context context = getActivity();
    public CodeList() {
        // Required empty public constructor
    }

    public void onViewCreated(View view, @Nullable Bundle saveInstanceState)
    {
        String temp = getArguments().getString("title");
        super.onViewCreated(view, saveInstanceState);
        getActivity().setTitle(temp);
        CodeListing = (RecyclerView) view.findViewById(R.id.recyclerView);
        CodeListing.setHasFixedSize(true);
        CodeListing.setLayoutManager(new LinearLayoutManager(context));
        CodeListing.setAdapter(adapter);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_code_list, container, false);
    }

}
