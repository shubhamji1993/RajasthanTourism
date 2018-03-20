package com.example.shubhamtyagi.rajasthantourism;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shubham Tyagi on 17-03-2018.
 */

public class SectionsStatePagerAdapter extends FragmentStatePagerAdapter {
    //Variables used in class are declared here
    private List<Fragment> mFragmentList = new ArrayList<>();
    private List<String> mFragmentTitleList = new ArrayList<>();




    public SectionsStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, String title){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1){
            return new PlacesFragment();
        } else {
            return new NearbyFragment();
        }
    }

    /*@Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }*/

    @Override
    public int getCount() {
        return 3;
    }
}
