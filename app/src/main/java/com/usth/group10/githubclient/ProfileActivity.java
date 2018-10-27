package com.usth.group10.githubclient;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // set Adapter
        PagerAdapter adapter = new HomeFragmentPagerAdapter(
                getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.view_pager);
        pager.setOffscreenPageLimit(7);
        pager.setAdapter(adapter);


        //set header for tab
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(pager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

    }

    public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
        private final int PAGE_COUNT = 7;
        private String titles[] = new String[] { "Overview", "Feed", "Repositories","Starred",
                "Gists","followers","following" };
        public HomeFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public int getCount() {
            return PAGE_COUNT;
        }
        // number of pages for a ViewPager
        @Override
        public Fragment getItem(int page) {
            // returns an instance of Fragment corresponding to the specified page
            switch (page) {
                case 0: return new OverviewFragment();
                case 1: return new FeedFragment();
                case 2: return new RepositoriesFragment();
                case 3: return new StarredFragment();
                case 4: return new GistsFragment();
                case 5: return new FollowersFragment();
                case 6: return new FollowingFragment();
            }
            return new OverviewFragment(); // failsafe
        }
        @Override
        public CharSequence getPageTitle(int page) {
        // returns a tab title corresponding to the specified page
            return titles[page];
        }
    }
}
