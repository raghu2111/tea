package com.example.newtask.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newtask.R;
import com.example.newtask.model.Homerecylerview2;

import java.util.ArrayList;

public class Homerecyclerview3Adapter extends RecyclerView.Adapter<Homerecyclerview3Adapter.HomeViewHolder> {

ArrayList<Homerecylerview2>homerecylerview2ArrayList;

    public Homerecyclerview3Adapter(ArrayList<Homerecylerview2> homerecylerview2ArrayList) {
        this.homerecylerview2ArrayList = homerecylerview2ArrayList;
    }

    @NonNull
    @Override
    public Homerecyclerview3Adapter.HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_items,parent,false);

        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Homerecyclerview3Adapter.HomeViewHolder holder, int position) {
        holder.textView1.setText(homerecylerview2ArrayList.get(position).getTextview1());
        holder.textView2.setText(String.valueOf(homerecylerview2ArrayList.get(position).getTextview2()));
        holder.imageView.setImageResource(homerecylerview2ArrayList.get(position).getImage());
        holder.imageView.setImageResource(homerecylerview2ArrayList.get(position).getButton());


    }

    @Override
    public int getItemCount() {
        return homerecylerview2ArrayList.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder{


TextView textView1,textView2;
ImageView imageView;
Button button;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);


            textView1=itemView.findViewById(R.id.homeitem_name);
            textView2=itemView.findViewById(R.id.homeprice);
            imageView = itemView.findViewById(R.id.homeitem_img);
            button = itemView.findViewById(R.id.homerv3btn);
        }
    }



}
