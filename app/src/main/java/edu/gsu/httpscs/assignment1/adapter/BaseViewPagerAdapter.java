package edu.gsu.httpscs.assignment1.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by shauyasiami on 6/13/17.
 */

public class BaseViewPagerAdapter extends FragmentPagerAdapter {


  private  ArrayList<Fragment> list;
    public BaseViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public BaseViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> list) {
        super(fm);
        this.list = list;
    }


    @Override
    public Fragment getItem(int position) {
        return list.get(position );
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
