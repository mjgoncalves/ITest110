package com.example.marcelo.itest110.utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.example.marcelo.itest110.R;
import com.example.marcelo.itest110.home.MainActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class ViewExManager {
    public static void adaptBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableShiftingMode(false);

    }



}
