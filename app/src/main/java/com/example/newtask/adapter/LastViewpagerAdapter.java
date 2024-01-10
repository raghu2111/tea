package com.example.newtask.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.newtask.R;
import com.example.newtask.model.LastViewpager;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;

public class LastViewpagerAdapter extends RecyclerView.Adapter<LastViewpagerAdapter.Lastviewholder> {

    ArrayList<LastViewpager>lastViewpagerArrayList;
    ViewPager2 viewPager2;


    public LastViewpagerAdapter(ArrayList<LastViewpager> lastViewpagerArrayList, ViewPager2 viewPager2) {
        this.lastViewpagerArrayList = lastViewpagerArrayList;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public LastViewpagerAdapter.Lastviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewpagercups,parent,false);
        return new Lastviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LastViewpagerAdapter.Lastviewholder holder, int position) {
holder.lastimageview.setImageResource(lastViewpagerArrayList.get(position).getLastimage());
    }

    @Override
    public int getItemCount() {
        return lastViewpagerArrayList.size();
    }

  public class Lastviewholder extends RecyclerView.ViewHolder{

        RoundedImageView lastimageview;

      public Lastviewholder(@NonNull View itemView) {
          super(itemView);
        lastimageview  =itemView.findViewById(R.id.viewpager_lastimage);



      }
  }
}
