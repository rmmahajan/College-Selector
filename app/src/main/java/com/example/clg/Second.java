package com.example.clg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    TextView t1,t2,t3,t4;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t1 = findViewById(R.id.t6);
        t2 = findViewById(R.id.t8);
        t3 = findViewById(R.id.t7);
        t4 = findViewById(R.id.t9);
        b  = findViewById(R.id.bn);
        Intent i = getIntent();

        String questions = i.getStringExtra("total");
        String correct = i.getStringExtra("correct");
        String wrong = i.getStringExtra("incorrect");
        String score = i.getStringExtra("score");

        //int score = Integer.parseInt(correct)*10;
        int f = Integer.valueOf(correct)*10;

        String s = String.valueOf(f);
        t1.setText(questions);
        t2.setText(correct);
        t3.setText(wrong);
        t4.setText(s);


        //Toast.makeText(this, "abc "+f, Toast.LENGTH_SHORT).show();


        if(f>=90)
        {

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"You are Eligible for these Colleges.",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Second.this,User1.class);
                    startActivity(i);
                    finish();
                }
            });

        }
        else if(f>=75 && f<90)
        {

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"You are Eligible for these Colleges.",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Second.this,Display1.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        else if(f>=55 && f<75)
        {

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"You are Eligible for these Colleges.",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Second.this,Display2.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        else
        {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(getApplicationContext(),"Your Marks have been submitted",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Second.this,Display3.class);
                    startActivity(i);
                    finish();
                }
            });
        }

//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Your Marks have been submitted",Toast.LENGTH_LONG).show();
//                Intent i = new Intent(Second.this,User1.class);
//                startActivity(i);
//                finish();
//            }
//        });
//

    }
}