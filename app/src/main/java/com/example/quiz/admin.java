package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class admin extends AppCompatActivity {
    private EditText edname1,edpass1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        edname1 = findViewById(R.id.edname1);
        edpass1 = findViewById(R.id.edpass1);
        Button b4=findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate(edname1.getText().toString(), edpass1.getText().toString())){
                    Toast.makeText(v.getContext(),"Login Successful!",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(admin.this,adminDash.class));
                }
                else {
                    Toast.makeText(v.getContext(),"Username or password is invalid",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        startActivity(new Intent(admin.this,MainActivity.class));
    }
    public boolean validate(String s,String t){
        return (s.equals("Admin") && t.equals("admin"));
    }
}
