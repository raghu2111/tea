package com.example.newtask.adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.bumptech.glide.Glide;
import com.example.newtask.R;
import com.example.newtask.model.imagepager;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;
import java.util.List;

public class ImagepagerAdapter extends RecyclerView.Adapter<ImagepagerAdapter.ImgViewHolder> {

     ArrayList<imagepager> imageList;
     ViewPager2 viewPager2;

    public ImagepagerAdapter(ArrayList<imagepager> imageList, ViewPager2 viewPager2) {
        this.imageList = imageList;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public ImagepagerAdapter.ImgViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_container,parent,false);

        return new ImgViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImgViewHolder holder, int position) {

  //      Glide.with(holder.itemView.getContext()).load(imageList.get(position)).into(holder.imageView);
        //holder.imageView.setImageResource(imageList.get(position).getImage);
        holder.imageView.setImageResource(imageList.get(position).getImage());

        if(position == imageList.size()-2){
            viewPager2.post(runnable);
        }
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class ImgViewHolder extends RecyclerView.ViewHolder{

        RoundedImageView imageView;

        public ImgViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.viewpager_image);
        }
    }
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            imageList.addAll(imageList);
            notifyDataSetChanged();

        }
    };
}
