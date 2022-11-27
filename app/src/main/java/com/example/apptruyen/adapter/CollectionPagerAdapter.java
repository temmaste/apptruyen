package com.example.apptruyen.adapter;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.apptruyen.fragment.XemTTchapter;
import com.example.apptruyen.fragment.XemTTchitiet;

public class CollectionPagerAdapter extends FragmentStatePagerAdapter {


    public CollectionPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new XemTTchitiet();
            case 1:
                return new XemTTchapter();
            default:
                return new XemTTchitiet();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title="";
        switch (position){
            case 0:
                title ="chi tiết";
                break;
            case 1:
                title ="chapter";
                break;
        }
        return title;
    }
}
