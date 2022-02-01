package com.example.task8.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.os.Bundle;
import com.example.task8.Adapter.RecyclerAdapter;
import com.example.task8.Model.Member;
import com.example.task8.R;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<Member> members = new ArrayList<>();

        for (int i=0;i<=20;i++){
            members.add(new Member(R.mipmap.ic_profile, "Yahya " + i, "Mahmudiy " + i));
        }

        refreshAdapter(members);
    }

    void refreshAdapter(ArrayList<Member> members){
        RecyclerAdapter adapter = new RecyclerAdapter(context,members);
        recyclerView.setAdapter(adapter);
    }
}