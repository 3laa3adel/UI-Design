package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class help extends AppCompatActivity {
    TextView site1;
    TextView site2;
    TextView site3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        site1=findViewById(R.id.site1);
        site2=findViewById(R.id.site2);
        site3=findViewById(R.id.site3);
        site1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               sitev("https://www.who.int/");
            }
        });
        site2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sitev("https://www.instagram.com/who/");
            }
        });
        site3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sitev("https://www.facebook.com/WHO");
            }
        });
    }
    public void sitev(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}