package com.example.appseguros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button registerButton;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerButton = findViewById(R.id.registro);
        registerButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,RegistroActivity.class);
            startActivity(intent);
        });

        loginButton = findViewById(R.id.login);
        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,InicioSesionActivity.class);
            startActivity(intent);
        });
    }
}