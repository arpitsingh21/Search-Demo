package com.example.dell.demo.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.dell.demo.Model;
import com.example.dell.demo.R;

import java.util.List;

/**
 * Created by dell on 14-08-2017.
 */
public class RecyclerviewAdapter  extends RecyclerView.Adapter
        <RecyclerviewAdapter.ListItemViewHolder> {
    private List<Model> items;
    Context context;
    private SparseBooleanArray selectedItems;

   public RecyclerviewAdapter(List<Model> modelData, Context context) {
        if (modelData == null) {
            throw new IllegalArgumentException("modelData must not be null");
        }
        this.context=context;
        items = modelData;
        selectedItems = new SparseBooleanArray();
    }

    @Override
    public ListItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.single_item, viewGroup, false);
        return new ListItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ListItemViewHolder viewHolder, int position) {
        Model model = items.get(position);
        viewHolder.item.setText(String.valueOf(model.data));
        viewHolder.detail.setText(String.valueOf(model.text));


        Glide.with(context).load(model.s)
                .thumbnail(0.8f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(viewHolder.imageurl);



        viewHolder.itemView.setActivated(selectedItems.get(position, false));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public final static class ListItemViewHolder extends RecyclerView.ViewHolder {
        TextView item;
        TextView detail;
        ImageView imageurl;
        public ListItemViewHolder(View itemView) {
            super(itemView);
            item = (TextView) itemView.findViewById(R.id.txt_label_item);
            detail = (TextView) itemView.findViewById(R.id.txt_date_time);
            imageurl=(ImageView)itemView.findViewById(R.id.imageView2);
        }
    }
}
