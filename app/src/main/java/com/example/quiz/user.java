package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class user extends AppCompatActivity {
    private EditText edname,edpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        edname = findViewById(R.id.edname);
        edpass = findViewById(R.id.edpass);
        Button b3=findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate(edname.getText().toString(), edpass.getText().toString())){
                    Toast.makeText(v.getContext(),"Login Successful!",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(user.this,UserDash.class));
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
        startActivity(new Intent(user.this,MainActivity.class));
    }
    public boolean validate(String s,String t){
            return (s.equals("player") && t.equals("quiztime"));
    }
    public void click(View v){
        startActivity(new Intent(user.this,Reg.class));
    }
}
