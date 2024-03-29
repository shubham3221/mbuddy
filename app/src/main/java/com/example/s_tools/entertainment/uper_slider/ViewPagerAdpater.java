package com.example.s_tools.entertainment.uper_slider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdpater extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> isttitle = new ArrayList<>();
    FragmentManager fragmentManager;
    public ViewPagerAdpater(@NonNull FragmentManager fm) {
        super(fm);
        this.fragmentManager = fm;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return isttitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return isttitle.get(position);
    }
    public void addFragment(Fragment fragment, String title){
        fragmentList.add(fragment);
        isttitle.add(title);
    }
}
