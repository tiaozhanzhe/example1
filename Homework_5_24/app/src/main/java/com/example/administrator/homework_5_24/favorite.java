package com.example.administrator.homework_5_24;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class favorite extends AppCompatActivity {
    private ImageView imgv_departure;
    private ImageView imgv_my;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite);
        imgv_departure=(ImageView) findViewById(R.id.img_departure);
        imgv_my=(ImageView) findViewById(R.id.img_my1);
        imgv_departure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.img_departure:
                        Intent intent=new Intent(favorite.this, departure.class);
                        startActivity(intent);
                }
            }
        });
        ////////
        imgv_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.img_my1:
                        Intent intent=new Intent(favorite.this, my1.class);
                        startActivity(intent);
                }
            }
        });
        /////
}

}
