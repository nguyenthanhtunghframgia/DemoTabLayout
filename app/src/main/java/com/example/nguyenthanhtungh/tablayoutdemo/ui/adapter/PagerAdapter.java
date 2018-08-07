package com.example.nguyenthanhtungh.tablayoutdemo.ui.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.nguyenthanhtungh.tablayoutdemo.ui.fragment.FirstFragment;
import com.example.nguyenthanhtungh.tablayoutdemo.ui.fragment.SecondFragment;
import com.example.nguyenthanhtungh.tablayoutdemo.ui.fragment.ThirdFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new FirstFragment();
                break;
            case 1:
                fragment = new SecondFragment();
                break;
            case 2:
                fragment = new ThirdFragment();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "FIRST";
                break;
            case 1:
                title = "SECOND";
                break;
            case 2:
                title = "THIRD";
                break;
        }
        return title;
    }
}
