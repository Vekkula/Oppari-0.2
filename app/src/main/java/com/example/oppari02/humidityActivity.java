package com.example.oppari02;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;


public class humidityActivity extends AppCompatActivity // <- extend this instead of MainActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onStart() {
        super.onStart();

        View m = findViewById(R.id.textView);   //tämä "poistaa" etusivun tekstin/sisällön
        m.setVisibility(View.GONE);   //tämä "poistaa" etusivun tekstin/sisällön

        View h = findViewById(R.id.textHumidity);
        h.setVisibility(View.VISIBLE);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}