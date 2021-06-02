package com.example.miwokapp;

public class word {

    private String mdefault;
    private String mmiwok;
    private int mImageResourceId;


    public word(String udefault, String umiwok, int imageResourceId) {
        mdefault = udefault;
        mmiwok = umiwok;
        mImageResourceId = imageResourceId;


    }
    public String getdefault(){
        return mdefault;
    }
    public String getmiwok(){

        return mmiwok;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
