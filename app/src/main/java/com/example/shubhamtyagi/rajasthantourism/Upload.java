package com.example.shubhamtyagi.rajasthantourism;

import android.widget.ProgressBar;

/**
 * Created by Shubham Tyagi on 19-03-2018.
 */

public class Upload {
    private String mAddress;
    private String mCoordinates;
    private String mImageUrl;
    private String mName;



    public Upload(){
        //empty constructor needed
    }

    public Upload(String name, String address, String imageUrl, String longitude,String latitude){
        if(name.trim().equals("")){
            name = "No Name";
        }
        mName = name;
        mImageUrl = imageUrl;
    }

    public String getCoordinates(){
        return mCoordinates;
    }

    public String getAddress() {

        return mAddress;
    }

    public String getName() {

        return mName;
    }


    public String getImageUrl() {

        return mImageUrl;
    }
}
