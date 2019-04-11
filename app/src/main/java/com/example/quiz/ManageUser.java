package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ManageUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_user);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        startActivity(new Intent(ManageUser.this,adminDash.class));
    }
}
