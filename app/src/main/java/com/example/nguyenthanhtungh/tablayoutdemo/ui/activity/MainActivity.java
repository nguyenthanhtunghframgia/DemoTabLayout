package com.example.nguyenthanhtungh.tablayoutdemo.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nguyenthanhtungh.tablayoutdemo.R;
import com.example.nguyenthanhtungh.tablayoutdemo.ui.adapter.PagerAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewPager();
        initTabLayout();
    }

    private void initTabLayout() {
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(i).setIcon(R.drawable.ic_launcher_background);
        }
    }

    private void initViewPager() {
        viewPager = findViewById(R.id.view_pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        PagerAdapter pagerAdapter = new PagerAdapter(this, fragmentManager);
        viewPager.setAdapter(pagerAdapter);
    }
}
