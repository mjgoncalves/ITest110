package com.example.marcelo.itest110.home;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.marcelo.itest110.MessagesFragment;
import com.example.marcelo.itest110.R;
import com.example.marcelo.itest110.utils.SectionsPagerAdapter;
import com.example.marcelo.itest110.utils.ViewExManager;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupTabs();
        setupBottomNavigationView();
    }


    private void setupTabs() {

        ViewPager viewPager = findViewById(R.id.view_pager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        SectionsPagerAdapter pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragments(new CameraFragment());
        pagerAdapter.addFragments(new HomeFragment());
        pagerAdapter.addFragments(new MessagesFragment());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        Objects.requireNonNull(tabLayout.getTabAt(0)).setIcon(R.drawable.ic_camera);
        Objects.requireNonNull(tabLayout.getTabAt(1)).setText(getString(R.string.instagram));
        Objects.requireNonNull(tabLayout.getTabAt(2)).setIcon(R.drawable.ic_messages);

    }

    public void setupBottomNavigationView(){

        BottomNavigationViewEx bottomNavigationViewEx = findViewById(R.id.view_ex);
        ViewExManager.adaptBottomNavigationView(bottomNavigationViewEx);

    }
}
