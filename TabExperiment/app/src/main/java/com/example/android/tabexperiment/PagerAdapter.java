package com.example.android.tabexperiment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumbersOfTabs;

    public PagerAdapter(FragmentManager fm, int numbersOfTabs) {
        super(fm);
        this.mNumbersOfTabs = numbersOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0: return new TabFragment1();
            case 1: return new TabFragment2();
            case 2: return new TabFragment3();
            default:  return null;
        }
    }

    @Override
    public int getCount() {
        return mNumbersOfTabs;
    }
}
