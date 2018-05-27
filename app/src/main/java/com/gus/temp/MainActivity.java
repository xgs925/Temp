package com.gus.temp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;


import com.gus.temp.common.BaseActivity;
import com.gus.temp.fragment.LocalMediaFragment;
import com.gus.temp.fragment.MediaFolderFragment;
import com.gus.temp.fragment.OnlineMediaFragment;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.vp_container)
    ViewPager mViewPager;
    @BindView(R.id.tb_title)
    TabLayout mTabLayout;
    private String[] mTitles = new String[]{"最近", "相册", "在线"};
    private SectionsPagerAdapter mSectionsPagerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);
        for (int i = 0; i < mTitles.length; i++) {
            mTabLayout.addTab(mTabLayout.newTab().setText(mTitles[i]));
        }
        mTabLayout.setupWithViewPager(mViewPager);//给TabLayout设置关联ViewPager，如果设置了ViewPager，那么ViewPagerAdapter中的getPageTitle()方法返回的就是Tab上的标题
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        private LocalMediaFragment localMediaFragment;
        private MediaFolderFragment mediaFolderFragment;
        private OnlineMediaFragment onlineMediaFragment;

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    if (localMediaFragment == null) localMediaFragment = new LocalMediaFragment();
                    return localMediaFragment;
                case 1:
                    if (mediaFolderFragment == null) mediaFolderFragment = new MediaFolderFragment();
                    return mediaFolderFragment;
                case 2:
                    if (onlineMediaFragment == null) onlineMediaFragment = new OnlineMediaFragment();
                    return onlineMediaFragment;
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }
    }
}
