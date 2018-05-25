package com.example.administrator.homework_5_24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText_user;
    private EditText editText_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bmob.initialize(this, "5c059f70cd01dc4fdb50ede184f551cc");
        Button button_login=(Button) findViewById(R.id.button_login);
        Button button_signup=(Button) findViewById(R.id.button_signup);
        editText_user= (EditText) findViewById(R.id.edittext_username);
        editText_password=(EditText) findViewById(R.id.edittext_password);

        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                            Toast.makeText(MainActivity.this,"登录成功", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(MainActivity.this, departure.class);
                            startActivity(intent);
                    }
                });
    }
}
