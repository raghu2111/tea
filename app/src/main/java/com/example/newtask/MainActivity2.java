package com.example.newtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.newtask.adapter.MyAdapter;
import com.example.newtask.model.TeaModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

RecyclerView recyclerView;
MyAdapter myAdapter;
    ArrayList<TeaModel>teaModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



recyclerView = findViewById(R.id.recyclerView);
teaModelList = new ArrayList<>();

TeaModel a1= new TeaModel("Chocolate Vanilla Herbal Tea",R.drawable.blend, 16,-25);
        TeaModel a2= new TeaModel("Chocolate Vanilla Herbal Tea",R.drawable.blend, 16,-25);
        TeaModel a3= new TeaModel("Chocolate Vanilla Herbal Tea",R.drawable.blend, 16,-25);
        TeaModel a4= new TeaModel("Chocolate Vanilla Herbal Tea",R.drawable.blend, 16,-25);
        TeaModel a5= new TeaModel("Chocolate Vanilla Herbal Tea",R.drawable.blend, 16,-25);
        TeaModel a6= new TeaModel("Chocolate Vanilla Herbal Tea",R.drawable.blend, 16,-25);

teaModelList.add(a1);
        teaModelList.add(a2);
        teaModelList.add(a3);
        teaModelList.add(a4);
        teaModelList.add(a5);
        teaModelList.add(a6);

        myAdapter=new MyAdapter(teaModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);

    }
}