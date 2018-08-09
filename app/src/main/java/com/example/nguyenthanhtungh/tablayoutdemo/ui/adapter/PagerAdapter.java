package com.example.nguyenthanhtungh.tablayoutdemo.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.nguyenthanhtungh.tablayoutdemo.R;
import com.example.nguyenthanhtungh.tablayoutdemo.ui.fragment.FirstFragment;
import com.example.nguyenthanhtungh.tablayoutdemo.ui.fragment.SecondFragment;
import com.example.nguyenthanhtungh.tablayoutdemo.ui.fragment.ThirdFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public static final int NUMBER_OF_FRAGMENT = 3;
    private Context mContext;

    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_FRAGMENT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        switch (position) {
            case 0:
                title = mContext.getResources().getString(R.string.first_fragment_title);
                break;
            case 1:
                title = mContext.getResources().getString(R.string.first_fragment_title);
                break;
            case 2:
                title = mContext.getResources().getString(R.string.first_fragment_title);
                break;
        }
        return title;
    }
}
