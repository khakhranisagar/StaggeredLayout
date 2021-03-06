package com.example.sagarkhakhrani.staggeredlayout;

/**
 * Created by sagar.khakhrani on 12-01-2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
public class MyAdapter  extends RecyclerView.Adapter<MyViewHolder> {
    private List<ItemObjects> itemList;
    private Context context;

    public MyAdapter(Context context, List<ItemObjects> itemList)
    {
        this.itemList = itemList;
        this.context = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_list, null);
        MyViewHolder rcv = new MyViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.personName.setText(itemList.get(position).getName());
        holder.personPhoto.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();

    }
}
