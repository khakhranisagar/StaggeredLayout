package com.example.sagarkhakhrani.staggeredlayout;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sagar.khakhrani on 12-01-2017.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {

    public TextView personName;
    public ImageView personPhoto;


    public MyViewHolder(View itemView){
        super(itemView);
        itemView.setOnClickListener(this);
        personName = (TextView) itemView.findViewById(R.id.person_name);
        personPhoto = (ImageView) itemView.findViewById(R.id.person_photo);
    }
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }

}
