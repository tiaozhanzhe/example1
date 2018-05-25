package com.example.administrator.homework_5_24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class departure extends AppCompatActivity {
    private ImageView imgv_favorite;
    private ImageView imgv_my;
    private ImageView imgv_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.departure);
        imgv_favorite=(ImageView) findViewById(R.id.img_favorite);
        imgv_my=(ImageView) findViewById(R.id.img_my0);
        imgv_input=(ImageView) findViewById(R.id.departure1);
        ////////
        imgv_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.img_my0:
                        Intent intent=new Intent(departure.this, my1.class);
                        startActivity(intent);
                }
            }
        });
        ////////
        imgv_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.departure1:
                        Intent intent=new Intent(departure.this, InPutRequire.class);
                        startActivity(intent);
                }
            }
        });
        /////
        imgv_favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.img_favorite:
                        Intent intent=new Intent(departure.this, favorite.class);
                        startActivity(intent);
                }
            }
        });


    }
}
