package com.example.cvmaker;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;


    public PagerAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return  new Intro();
            case 1:
                return new Contact();
            case 2:
                return new Education();
            case 3:
                return new Work();
            case 4:
                return new Summary();
            case 5:
                return new Additional();
            case 6:
                return new Finish();
            default:
                return null;

        }

    }

    @Override
    public int getCount()
    {
        return numOfTabs;
    }
}
