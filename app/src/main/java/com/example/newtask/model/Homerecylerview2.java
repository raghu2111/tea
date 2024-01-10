package com.example.newtask.model;

public class Homerecylerview2 {
    int image,button;
    String textview1,textview2;

    public Homerecylerview2(int image, int button, String textview1, String textview2) {
        this.image = image;
        this.button = button;
        this.textview1 = textview1;
        this.textview2 = textview2;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getButton() {
        return button;
    }

    public void setButton(int button) {
        this.button = button;
    }

    public String getTextview1() {
        return textview1;
    }

    public void setTextview1(String textview1) {
        this.textview1 = textview1;
    }

    public String getTextview2() {
        return textview2;
    }

    public void setTextview2(String textview2) {
        this.textview2 = textview2;
    }
}
