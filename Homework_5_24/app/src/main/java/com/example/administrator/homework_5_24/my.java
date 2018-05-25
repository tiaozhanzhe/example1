package com.example.administrator.homework_5_24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class my extends AppCompatActivity {
    private ImageView imgv_favorite;
    private ImageView imgv_departure;
    //private Button interest;
    //private Button history;
    private Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my);
        /*
        imgv_departure = (ImageView) findViewById(R.id.img_departure);
        imgv_favorite = (ImageView) findViewById(R.id.img_favorite);
        help=(Button)findViewById(R.id.but_help);

        ////////
        imgv_departure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.img_departure:
                        Intent intent = new Intent(my.this, departure.class);
                        startActivity(intent);
                }
            }
        });
        ////////
        imgv_favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.img_favorite:
                        Intent intent=new Intent(my.this, favorite.class);
                        startActivity(intent);
                }
            }
        });
        /////
        ////////
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.but_help:
                        Intent intent = new Intent(my.this, help.class);
                        startActivity(intent);
                }
            }
        });
        */
    }
}