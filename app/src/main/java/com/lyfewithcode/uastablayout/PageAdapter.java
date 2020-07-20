package com.lyfewithcode.uastablayout;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PageAdapter extends FragmentPagerAdapter {
    private int numoftabs;
    public PageAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numoftabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TabCharacters();
            case 1:
                return new TabPlanets();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
