package com.example.cvmaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        TabLayout tabLayout = findViewById(R.id.tablayout);
        TabItem tabIntro = findViewById(R.id.intro);
        TabItem tabContact = findViewById(R.id.contact);
        TabItem tabEducation = findViewById(R.id.education);
        TabItem tabWork = findViewById(R.id.work);
        TabItem tabSummary = findViewById(R.id.summary);
        TabItem tabAdditional = findViewById(R.id.additional);
        TabItem tabFinish = findViewById(R.id.finish);
        final ViewPager viewPager = findViewById(R.id.viewpager);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.add(R.id.viewpager,new Contact());
        fragmentTransaction.commit();

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(),
               tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}