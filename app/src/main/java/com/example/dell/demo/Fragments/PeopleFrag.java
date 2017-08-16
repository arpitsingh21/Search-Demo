package com.example.dell.demo.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.demo.Adapters.RecyclerAdapter;
import com.example.dell.demo.Models.ItemObject;
import com.example.dell.demo.R;

import java.util.ArrayList;
import java.util.List;


public class PeopleFrag extends Fragment {
    RecyclerAdapter adapter;
    RecyclerView recyclerView;
    private  List<ItemObject> demoData;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recyclerlist, container,
                false);
        recyclerView = (RecyclerView)view.findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        demoData = new ArrayList<>();
        ItemObject model = new ItemObject("Test1","Test2",R.drawable.arrow_bleu);
        demoData.add(model);
        adapter = new RecyclerAdapter(getActivity(),demoData);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
