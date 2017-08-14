package com.example.dell.demo.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.dell.demo.Fragments.CategoryFrag;
import com.example.dell.demo.Fragments.PeopleFrag;
import com.example.dell.demo.Fragments.PlacesFrag;
import com.example.dell.demo.Fragments.PopularFrag;

/**
 * Created by dell on 14-08-2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                PopularFrag popularFrag = new PopularFrag();
                return popularFrag;
            case 1:
                PeopleFrag peopleFrag = new PeopleFrag();
                return peopleFrag;
            case 2:
                PlacesFrag placesFrag = new PlacesFrag();
                return placesFrag;
            case 3:
                CategoryFrag categoryFrag = new CategoryFrag();
                return categoryFrag;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}