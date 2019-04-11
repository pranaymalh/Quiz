package com.example.quiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class advancedQ extends AppCompatActivity {
    private Question q=new Question();
    private TextView mScoreview;
    private TextView mQues;
    private Button c1;
    private Button c2;
    private Button c3,quit;
    private String mAnswer;
    private int mScore=0;
    private int questionNumber=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_q);
        mScoreview=findViewById(R.id.score);
        mQues=findViewById(R.id.question);
        c1=findViewById(R.id.choice1);
        c2=findViewById(R.id.choice2);
        c3=findViewById(R.id.choice3);
        quit=findViewById(R.id.quit);
        updateQuestion();
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1.getText().toString().equals(mAnswer)){
                    mScore+=1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(v.getContext(),"Correct!",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(v.getContext(),"Wrong!",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c2.getText().toString().equals(mAnswer)){
                    mScore+=1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(v.getContext(),"Correct!",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(v.getContext(),"Wrong!",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c3.getText().toString().equals(mAnswer)){
                    mScore+=1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(v.getContext(),"Correct!",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(v.getContext(),"Wrong!",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert_b=new AlertDialog.Builder(advancedQ.this,R.style.MyDialog).setTitle("Alert!!!");
                alert_b.setMessage("Do you really want to quit? ").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(advancedQ.this,UserDash.class));
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog a=alert_b.create();
                a.show();
            }
        });
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        startActivity(new Intent(advancedQ.this,UserDash.class));
    }
    public void updateQuestion(){
        if(questionNumber<4) {
            mQues.setText(q.getQuestion(questionNumber));
            c1.setText(q.getChoice1(questionNumber));
            c2.setText(q.getChoice2(questionNumber));
            c3.setText(q.getChoice3(questionNumber));
            mAnswer = q.getCorrect(questionNumber);
            questionNumber += 1;
        }
        else{
            AlertDialog.Builder alert=new AlertDialog.Builder(advancedQ.this,R.style.MyDialog);
            alert.setMessage("Want to go back? \n"+"Your Score is: "+String.valueOf(mScore)).setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    startActivity(new Intent(advancedQ.this,UserDash.class));
                }
            });
            AlertDialog a=alert.create();
            a.setTitle("Game Over!!!");
            a.show();
        }
    }
    public void updateScore(int p){
        mScoreview.setText(String.valueOf(p));
    }
}