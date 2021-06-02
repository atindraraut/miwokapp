package com.example.miwokapp;

public class colors {

    private String mdefault;
    private String mmivok;
    private int mimagesourceid;

    public colors(String vdefault, String vmivok, int vimagesourceid) {
        mdefault=vdefault;
        mmivok=vmivok;
        mimagesourceid=vimagesourceid;

    }
    public String getdefault(){
        return mdefault;
    }
    public String getmiwok(){

        return mmivok;
    }
    public int getImageResourceId() {
        return mimagesourceid;
    }
}
