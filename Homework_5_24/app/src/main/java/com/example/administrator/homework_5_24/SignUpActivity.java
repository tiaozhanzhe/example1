package com.example.administrator.homework_5_24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    private EditText editText_user;
    private EditText editText_password1;
    private EditText editText_password2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        editText_user=(EditText) findViewById(R.id.edittext_username);
        editText_password1=(EditText) findViewById(R.id.edittext_password1);
        editText_password2=(EditText) findViewById(R.id.edittext_password2);
        Button button_signup=(Button) findViewById(R.id.button_signup);
        Button button_return=(Button) findViewById(R.id.button_return);
        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText_password1.getText().toString().equals(editText_password2.getText().toString())){
                    Toast.makeText(SignUpActivity.this,"注册成功",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(SignUpActivity.this,"两次输入密码不一致！", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });







    }
}
