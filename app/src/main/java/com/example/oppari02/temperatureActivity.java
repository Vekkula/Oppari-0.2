package com.example.oppari02;

import android.support.design.widget.NavigationView;
import android.view.View;

//todo luokanimet alkaa isolla
public class temperatureActivity extends MainActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onStart() {
        super.onStart();

        View m = findViewById(R.id.textView);   //tämä "poistaa" etusivun tekstin/sisällön
        m.setVisibility(View.GONE);   //tämä "poistaa" etusivun tekstin/sisällön

        View t = findViewById(R.id.textTemperature);
        t.setVisibility(View.VISIBLE);
    }

}