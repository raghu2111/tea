package com.example.newtask.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newtask.R;
import com.example.newtask.model.TeaModel;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.TeaViewHolder> {

    ArrayList<TeaModel>teaModelList;

    public MyAdapter(ArrayList<TeaModel> teaModelList) {
        this.teaModelList = teaModelList;
    }

    @NonNull
    @Override
    public MyAdapter.TeaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main2,parent,false);
        return new TeaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.TeaViewHolder holder, int position) {
        holder.textView1.setText(String.valueOf(teaModelList.get(position).getPercentage()));
        holder.textView2.setText(teaModelList.get(position).getItem_name());
        holder.textView3.setText(String.valueOf( teaModelList.get(position).getPrice()));
        holder.imageView.setImageResource(teaModelList.get(position).getItem_img());

    }

    @Override
    public int getItemCount() {
        return teaModelList.size();
    }


public class TeaViewHolder extends RecyclerView.ViewHolder{

        TextView textView1,textView2,textView3;
        ImageView imageView;

    public TeaViewHolder(@NonNull View itemView) {
        super(itemView);


        textView1= itemView.findViewById(R.id.percentage);
        textView2= itemView.findViewById(R.id.item_name);
        textView3= itemView.findViewById(R.id.price);
        imageView = itemView.findViewById(R.id.item_img);
    }
}
}
