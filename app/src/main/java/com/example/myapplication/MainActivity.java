package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1 ;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openoverview();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openstat();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensyndrome();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhealthinfo();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhelp();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrate();
            }
        });

    }
    public void openoverview(){
        Intent i=new Intent(this,overview.class);
        startActivity(i);
    }



    public void opensyndrome(){
        Intent i=new Intent(this,syndrome.class);
        startActivity(i);
    }
    public void openhealthinfo(){
        Intent i=new Intent(this,healthinfo.class);
        startActivity(i);
    }
    public void openstat(){
        Intent i=new Intent(this,stat.class);
        startActivity(i);
    }
    public void openrate(){
        Intent i=new Intent(this,rate.class);
        startActivity(i);
    }
    public void openhelp(){
        Intent i=new Intent(this,help.class);
        startActivity(i);
    }
}