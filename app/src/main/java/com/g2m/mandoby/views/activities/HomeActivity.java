package com.g2m.mandoby.views.activities;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;

import com.g2m.mandoby.R;
import com.g2m.mandoby.views.fragments.InvoicesFragment;
import com.g2m.mandoby.views.fragments.MainFragment;
import com.g2m.mandoby.views.fragments.OfferFragment;
import com.g2m.mandoby.views.fragments.OrderHstoryFragment;
import com.g2m.mandoby.views.fragments.PointsFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.transition.FragmentTransitionSupport;

import android.view.Menu;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
ImageView cart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        cart=findViewById(R.id.cart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,CartActivity.class));
            }
        });

        Fragment orderHstoryFragment=new MainFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fragment, orderHstoryFragment).commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action

            Fragment orderHstoryFragment=new MainFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.fragment, orderHstoryFragment).commit();
        } else if (id == R.id.nav_gallery) {
            OrderHstoryFragment orderHstoryFragment=new OrderHstoryFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.fragment, orderHstoryFragment).commit();

        } else if (id == R.id.nav_offers) {

            Fragment orderHstoryFragment=new OfferFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.fragment, orderHstoryFragment).commit();
        } else if (id == R.id.nav_points) {

            Fragment orderHstoryFragment=new PointsFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.fragment, orderHstoryFragment).commit();
        } else if (id == R.id.nav_invoices) {

            Fragment orderHstoryFragment=new InvoicesFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.fragment, orderHstoryFragment).commit();
        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
