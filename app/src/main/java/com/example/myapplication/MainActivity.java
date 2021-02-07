package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button BtnLogin;
    private EditText EtUsername;
    private EditText EtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnLogin = findViewById(R.id.btn_login);
        EtUsername = findViewById(R.id.et_1);
        EtPassword = findViewById(R.id.et_2);

        BtnLogin.setOnClickListener(this);
    }


    public void onClick(View v){
        String username = EtUsername.getText().toString();
        String password = EtPassword.getText().toString();
        Intent intent = null;

        intent = new Intent(MainActivity.this,MusicActivity.class);
        startActivity(intent);

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}