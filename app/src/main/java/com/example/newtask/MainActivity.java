package com.example.newtask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newtask.adapter.Homerecyclerview3Adapter;
import com.example.newtask.adapter.ImagepagerAdapter;
import com.example.newtask.adapter.LastViewpagerAdapter;
import com.example.newtask.model.Homerecylerview2;
import com.example.newtask.model.LastViewpager;
import com.example.newtask.model.imagepager;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //viewpager1
    ImageView imageView1,imageView2;
     ViewPager2 viewPager2;
     ArrayList<imagepager>imageList;
     ImagepagerAdapter imagepagerAdapter;
     Handler sliderhandler = new Handler();

     ArrayList<Homerecylerview2>homerecylerview2ArrayList;
     Homerecyclerview3Adapter homerecyclerview3Adapter;
     RecyclerView recyclerView;


     ViewPager2 lastviewPager2;
     ArrayList<LastViewpager>lastViewpagerArrayList;
     LastViewpagerAdapter lastViewpagerAdapter;





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

        //viewpager1

        viewPager2 = findViewById(R.id.viewpager2);
        imageList = new ArrayList<>();

       imageList.add(new imagepager(R.drawable.viewpager11));
        imageList.add(new imagepager(R.drawable.viewpager12));
        imageList.add(new imagepager(R.drawable.viewpager13));
        imageList.add(new imagepager(R.drawable.viewpager14));


imagepagerAdapter=new ImagepagerAdapter(imageList,viewPager2);
viewPager2.setAdapter(imagepagerAdapter);

viewPager2.setOffscreenPageLimit(5);
viewPager2.setClipToPadding(false);
viewPager2.setClipChildren(false);

viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

CompositePageTransformer transformer = new CompositePageTransformer();
transformer.addTransformer(new MarginPageTransformer(40));
transformer.addTransformer(new ViewPager2.PageTransformer() {
    @Override
    public void transformPage(@NonNull View page, float position) {
        float r = 1- Math.abs(position);
        page.setScaleY(0.85f + r * 0.14f);
    }
});
viewPager2.setPageTransformer(transformer);
viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
    @Override
    public void onPageSelected(int position) {
        super.onPageSelected(position);
        sliderhandler.removeCallbacks(sliderRunnable);
        sliderhandler.postDelayed(sliderRunnable,3000);

    }
});


lastviewPager2 = findViewById(R.id.viewpager3);
lastViewpagerArrayList=new ArrayList<>();

        lastViewpagerArrayList.add(new LastViewpager(R.drawable.gaiwan));
        lastViewpagerArrayList.add(new LastViewpager(R.drawable.blend));
        lastViewpagerArrayList.add(new LastViewpager(R.drawable.leafsolo));
        lastViewpagerArrayList.add(new LastViewpager(R.drawable.teakettle1));
        lastViewpagerArrayList.add(new LastViewpager(R.drawable.gaiwan));

        lastViewpagerAdapter = new LastViewpagerAdapter(lastViewpagerArrayList,lastviewPager2);
        lastviewPager2.setAdapter(lastViewpagerAdapter);



recyclerView = findViewById(R.id.home_recyclerview3);
homerecylerview2ArrayList=new ArrayList<>();

Homerecylerview2 a1 = new Homerecylerview2(R.drawable.gaiwan,R.drawable.round_button,"Moutain Chai Loose Leaf","$ 14.00 - $ 20.00");
        Homerecylerview2 a2 = new Homerecylerview2(R.drawable.teakettle1, R.drawable.drawer,"Moutain Chai Loose Leaf","$ 14.00 - $ 20.00");
        Homerecylerview2 a3 = new Homerecylerview2(R.drawable.gaiwan,R.drawable.round_button,"Moutain Chai Loose Leaf","$ 14.00 - $ 20.00");
        Homerecylerview2 a4 = new Homerecylerview2(R.drawable.gaiwan,R.drawable.round_button,"Moutain Chai Loose Leaf","$ 14.00 - $ 20.00");
        Homerecylerview2 a5 = new Homerecylerview2(R.drawable.gaiwan,R.drawable.round_button,"Moutain Chai Loose Leaf","$ 14.00 - $ 20.00");
        Homerecylerview2 a6 = new Homerecylerview2(R.drawable.gaiwan,R.drawable.round_button,"Moutain Chai Loose Leaf","$ 14.00 - $ 20.00");
        Homerecylerview2 a7 = new Homerecylerview2(R.drawable.gaiwan,R.drawable.round_button,"Moutain Chai Loose Leaf","$ 14.00 - $ 20.00");
        Homerecylerview2 a8 = new Homerecylerview2(R.drawable.gaiwan,R.drawable.round_button,"Moutain Chai Loose Leaf","$ 14.00 - $ 20.00");


        homerecylerview2ArrayList.add(a1);
        homerecylerview2ArrayList.add(a2);
        homerecylerview2ArrayList.add(a3);
        homerecylerview2ArrayList.add(a4);
        homerecylerview2ArrayList.add(a5);
        homerecylerview2ArrayList.add(a6);
        homerecylerview2ArrayList.add(a7);
        homerecylerview2ArrayList.add(a8);

        homerecyclerview3Adapter = new Homerecyclerview3Adapter(homerecylerview2ArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(homerecyclerview3Adapter);


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
        ObjectAnimator translationX1 = ObjectAnimator.ofFloat(imageView1, "translationX", 0f, 1200f);
        ObjectAnimator translationX2 = ObjectAnimator.ofFloat(imageView2, "translationX", 0f, -1200f);
        translationX1.setDuration(1800);     translationX2.setDuration(1800);
        AnimatorSet forwardAnimatorSet = new AnimatorSet();
        forwardAnimatorSet.playTogether(translationX1, translationX2);
        ObjectAnimator reverseTranslationX1 = ObjectAnimator.ofFloat(imageView1, "translationX", 1200f, 0f);
        ObjectAnimator reverseTranslationX2 = ObjectAnimator.ofFloat(imageView2, "translationX", -1200f, 0f);
        reverseTranslationX1.setDuration(1800);
        reverseTranslationX2.setDuration(1800);
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


    //viewpager1
   private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem()+1);
        }
    };

    @Override
    protected void onPause() {
        super.onPause();
        sliderhandler.removeCallbacks(sliderRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sliderhandler.postDelayed(sliderRunnable,3000);
    }
}
