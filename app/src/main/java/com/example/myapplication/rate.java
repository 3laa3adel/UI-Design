package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class rate extends AppCompatActivity {
    Button subb;
    RatingBar r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        subb=findViewById(R.id.subb);
        r=findViewById(R.id.r);
        LayoutInflater inflater=getLayoutInflater();
        View layout = inflater.inflate(R.layout.custommassage,(ViewGroup)findViewById(R.id.cmm));
        final Toast t=new Toast(getApplicationContext());
        t.setGravity(Gravity.CENTER_VERTICAL,0,0);
        t.setDuration(Toast.LENGTH_SHORT);
        t.setView(layout);
        r.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                int rating=(int) v;
                String massage= null;
                switch (rating){
                    case 1:
                        massage="Thank You For Rating (1 Star)";
                        break;
                    case 2:
                        massage="Thank You For Rating (2 Stars)";
                        break;
                    case 3:
                        massage="Thank You For Rating (3 Stars)";
                        break;
                    case 4:
                        massage="Thank You For Rating (4 Stars)";
                        break;
                    case 5:
                        massage="Thank You For Rating (5 Stars)";
                        break;
                }
                Toast.makeText(rate.this,massage,Toast.LENGTH_SHORT).show();
            }
        });
        subb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.show();
            }
        });
    }
}