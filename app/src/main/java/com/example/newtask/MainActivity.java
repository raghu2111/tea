package com.example.newtask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1,imageView2;


    public DrawerLayout drawerLayout;

    ImageView imageView;

    public ActionBarDrawerToggle actionBarDrawerToggle;

    Button button;

    NavigationView navigationView;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Button button= findViewById(R.id.shopnow);
        drawerLayout=findViewById(R.id.drlayout);
        navigationView=findViewById(R.id.drawer);
        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.nav_home) {

                }


                return true;
            }


        });
        imageView=findViewById(R.id.sidenav);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

button.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {
        Intent i =new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i);
    }
});



        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        ObjectAnimator translationX1 = ObjectAnimator.ofFloat(imageView1, "translationX", 0f, 200f);
        ObjectAnimator translationX2 = ObjectAnimator.ofFloat(imageView2, "translationX", 0f, -200f);
        translationX1.setDuration(800);     translationX2.setDuration(800);
        AnimatorSet forwardAnimatorSet = new AnimatorSet();
        forwardAnimatorSet.playTogether(translationX1, translationX2);
        ObjectAnimator reverseTranslationX1 = ObjectAnimator.ofFloat(imageView1, "translationX", 200f, 0f);
        ObjectAnimator reverseTranslationX2 = ObjectAnimator.ofFloat(imageView2, "translationX", -200f, 0f);
        reverseTranslationX1.setDuration(800);
        reverseTranslationX2.setDuration(800);
        AnimatorSet reverseAnimatorSet = new AnimatorSet();
        reverseAnimatorSet.playTogether(reverseTranslationX1, reverseTranslationX2);
        new Handler().postDelayed(new Runnable() {
            @Override        public void run() {
            forwardAnimatorSet.start();
            new Handler().postDelayed(new Runnable() {
                @Override                public void run() {

                    reverseAnimatorSet.start();
                }             }, 800);
            }
            }, 800); }
    }
