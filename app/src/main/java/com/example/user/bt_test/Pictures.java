package com.example.user.bt_test;

/**
 * Created by User on 10/12/2017.
 */

public class Pictures {
    int image;
    String text;

    public Pictures(int image, String text) {
        this.image = image;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setText(String text) {
        this.text = text;
    }
}
