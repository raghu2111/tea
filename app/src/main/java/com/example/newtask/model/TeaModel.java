package com.example.newtask.model;

import android.widget.TextView;

public class TeaModel {

String item_name;
int item_img,price,percentage;

    public TeaModel(String item_name, int item_img, int price, int percentage) {
        this.item_name = item_name;
        this.item_img = item_img;
        this.price = price;
        this.percentage = percentage;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_img() {
        return item_img;
    }

    public void setItem_img(int item_img) {
        this.item_img = item_img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}


