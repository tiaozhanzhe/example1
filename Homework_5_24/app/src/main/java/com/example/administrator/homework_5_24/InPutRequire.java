package com.example.administrator.homework_5_24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.InputDevice;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class InPutRequire extends AppCompatActivity {
    private ImageView imgv_departure;
    private ImageView imgv_my;
    private ImageView imgv_favorite;
    private Button but_ok;
    private Button but_return;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_put_require);
        imgv_departure=(ImageView) findViewById(R.id.img_departure);
        imgv_my=(ImageView) findViewById(R.id.img_my);
        imgv_favorite=(ImageView) findViewById(R.id.img_favorite);
        but_ok=(Button)findViewById(R.id.but1);
        but_return=(Button)findViewById(R.id.but2);
        imgv_departure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.img_departure:
                        Intent intent=new Intent(InPutRequire.this, departure.class);
                        startActivity(intent);
                }
            }
        });
        ////////
        imgv_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.img_my:
                        Intent intent=new Intent(InPutRequire.this, my.class);
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
                        Intent intent=new Intent(InPutRequire.this, favorite.class);
                        startActivity(intent);
                }
            }
        });
        /////
        but_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.but1:
                        Intent intent=new Intent(InPutRequire.this, watch_result.class);
                        startActivity(intent);
                }
            }
        });
        /////
        but_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.but2:
                        Intent intent=new Intent(InPutRequire.this, departure.class);
                        startActivity(intent);
                }
            }
        });
        /////
    }
}
