package com.example.dell.demo.Fragments;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.demo.Adapters.RecyclerviewAdapter;
import com.example.dell.demo.Model;
import com.example.dell.demo.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryFrag extends Fragment {
    RecyclerviewAdapter adapter;
    RecyclerView recyclerView;
    private static List<Model> demoData;
    //final  Bitmap []bitmaps= new Bitmap[100];
    Bitmap bitmap;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }











    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.listview, container,
                false);
        recyclerView = (RecyclerView)view.findViewById(R.id.myList);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        demoData = new ArrayList<Model>();

        Model model = new Model("Test1","Test2","Test3");


        demoData.add(model);
        adapter = new RecyclerviewAdapter(demoData,getActivity());
        recyclerView.setAdapter(adapter);
        return view;
    }
}
