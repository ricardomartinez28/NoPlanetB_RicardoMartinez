package com.example.noplanetb_ricardomartinez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
    }

    public void siguienteActivity(View v){
        Intent i= new Intent(Login.this,MainActivity.class);
        startActivity(i);

    }
}
