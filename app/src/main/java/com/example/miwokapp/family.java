package com.example.miwokapp;

public class family {
    private String mdefault;
    private String mmivok;
    private int imageresourseid;
    public family(String vdefault, String vmivok, int vimageresourseid) {
        mdefault=vdefault;
        mmivok=vmivok;
        imageresourseid=vimageresourseid;
    }

    public String getdefault(){
        return mdefault;
    }
    public String getmiwok(){

        return mmivok;
    }
    public int getImageResourceId() {
        return imageresourseid;
    }
}
