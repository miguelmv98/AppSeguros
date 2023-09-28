package com.example.appseguros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RegistroActivity extends AppCompatActivity {

    Button signinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        signinButton = findViewById(R.id.btnRegistrarse);
        signinButton.setOnClickListener(v -> {
            Intent intent = new Intent(RegistroActivity.this,HomeActivity.class);
            startActivity(intent);
        });

    }
}
