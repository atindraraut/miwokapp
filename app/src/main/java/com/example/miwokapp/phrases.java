package com.example.miwokapp;

public class phrases {
    private String mdefault;
    private String mmivok;
    private int imageresourse;
    public phrases(String vdefault, String vmivok, int vimageresourse) {
        mdefault = vdefault;
        mmivok = vmivok;
        imageresourse=vimageresourse;
    }
    public String getdefault(){
        return mdefault;
    }
    public String getmiwok(){

        return mmivok;
    }
    public int getImageResourceId() {
        return imageresourse;
    }
}
