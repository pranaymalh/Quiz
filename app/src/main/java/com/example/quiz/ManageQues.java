package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ManageQues extends AppCompatActivity {
    private String mQuestion[]={"How many Bones does an adult human body have?",
            "What refer to performance of heart?",
            "What is the name of biggest part of the brain?",
            "_______ is a component of nervous system."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_ques);
        ListView listView=(ListView)findViewById(R.id.lv1);
        ArrayAdapter<String> a=new ArrayAdapter<String>(this,R.layout.custom_lv,mQuestion);
        listView.setAdapter(a);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        startActivity(new Intent(ManageQues.this,adminDash.class));
    }
}
