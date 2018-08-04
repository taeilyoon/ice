package com.tqeil.ice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tqeil.ice.model.user_model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecycleActivity extends AppCompatActivity {
    User_Adapter adapter;
    ArrayList<user_model> users = new ArrayList<user_model>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        user_model a = new user_model();
        a.User_image = R.drawable.key;
        a.name = "권민규";
        a.coment = "소정아 따량행^~^";
        a.job ="Designer";
        a.User_image = getDrawable(R.drawable.empty).hashCode();


        users.add(a);
        users.add(a);
        users.add(a);
        users.add(a);
        users.add(a);
        users.add(a);
        users.add(a);
        users.add(a);
        users.add(a);


        RecyclerView recycleview = findViewById(R.id.recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycleview.setLayoutManager(layoutManager);
        adapter = new User_Adapter(this,users);
        recycleview.setAdapter(adapter);



    }


}
