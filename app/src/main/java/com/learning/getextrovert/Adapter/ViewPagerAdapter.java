package com.learning.getextrovert.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.learning.getextrovert.Fragments.InnerNotificationFragment;
import com.learning.getextrovert.Fragments.NotificationFragment;
import com.learning.getextrovert.Fragments.RequestNotification;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0: return  new InnerNotificationFragment();
            case 1: return  new RequestNotification();
            default:return  new InnerNotificationFragment();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position==0){
            title = "NOTIFICATION";
        }else if(position==1){
            title="REQUEST";
        }
        return title;
    }
}
