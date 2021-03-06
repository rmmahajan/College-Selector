package com.example.clg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class User1 extends AppCompatActivity {

    ViewFlipper v_flipper;
    ImageView v1,c1,i1,b1,t1,vit,srm,bit,mn,du;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user1);

        v1 = findViewById(R.id.v);
        c1 = findViewById(R.id.c);
        i1 = findViewById(R.id.i);
        b1 = findViewById(R.id.b);
        t1 = findViewById(R.id.img);
        vit = findViewById(R.id.vit);
        srm = findViewById(R.id.srm);
        bit = findViewById(R.id.bits);
        mn = findViewById(R.id.manipal);
        du = findViewById(R.id.du);
        Button b2=(Button)findViewById(R.id.btn1);
        Button b3=(Button)findViewById(R.id.btn2);
        Button b4=(Button)findViewById(R.id.btn3);
        Button b5=(Button)findViewById(R.id.btn4);
        Button b6=(Button)findViewById(R.id.btn5);
        Button b7=(Button)findViewById(R.id.btn6);
        Button b8=(Button)findViewById(R.id.btn7);
        Button b9=(Button)findViewById(R.id.btn8);
        Button b10=(Button)findViewById(R.id.btn9);
        Button b11=(Button)findViewById(R.id.btn10);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, confirm.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, confirm.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, confirm.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, confirm.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, confirm.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, confirm.class);
                startActivity(intent);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, confirm.class);
                startActivity(intent);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, confirm.class);
                startActivity(intent);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, confirm.class);
                startActivity(intent);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, confirm.class);
                startActivity(intent);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, confirm.class);
                startActivity(intent);
            }
        });

        int images[] = {R.drawable.ctk, R.drawable.am4, R.drawable.cu3, R.drawable.lpu4, R.drawable.ctk1};

        v_flipper = (ViewFlipper) findViewById(R.id.v_flipper);

        for (int image : images) {
            flipperImages(image);
        }


        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this,amity.class);
                startActivity(intent);
            }
        });

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this,Chitkara.class);
                startActivity(intent);
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this,lovely.class);
                startActivity(intent);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, cuniversity.class);
                startActivity(intent);
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, Thapar.class);
                startActivity(intent);
            }
        });

        vit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this,Vit.class);
                startActivity(intent);
            }
        });

        du.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, Du.class);
                startActivity(intent);
            }
        });

        bit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this, Bits.class);
                startActivity(intent);
            }
        });

        mn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this,Manipal.class);
                startActivity(intent);
            }
        });

        srm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User1.this,Srm.class);
                startActivity(intent);
            }
        });
    }


    public void flipperImages(int image){

        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setInAnimation(this,android.R.anim.slide_out_right);
    }
}