package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Reg extends AppCompatActivity {
    private EditText edname,edpass,edcpass,age;
    private RadioButton r1,r2;
    private Button regis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        edname=findViewById(R.id.edname);
        edpass=findViewById(R.id.edpass);
        edcpass=findViewById(R.id.edcpass);
        age=findViewById(R.id.edage);
        r1=findViewById(R.id.radioButton);
        r2=findViewById(R.id.radioButton1);
        regis=findViewById(R.id.regis);
        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edname.getText().toString().equals("")||edpass.getText().toString().equals("")||age.getText().toString().equals("")||edcpass.getText().toString().equals("")||!(!r1.isChecked()||!r2.isChecked())){
                    Toast.makeText(v.getContext(),"Please fill out all fields!",Toast.LENGTH_SHORT).show();
                }
                else if(!edpass.getText().toString().equals(edcpass.getText().toString())){
                    Toast.makeText(v.getContext(),"Passwords do not match!",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(v.getContext(),"Registration Successfull!!!",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Reg.this,user.class));
                }
            }
        });

    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        startActivity(new Intent(Reg.this,user.class));
    }
}
