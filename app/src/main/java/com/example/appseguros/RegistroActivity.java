package com.example.appseguros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RegistroActivity extends AppCompatActivity {
    Button registerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        registerButton = findViewById(R.id.Registrarse);
        registerButton.setOnClickListener(v -> {
            Intent intent = new Intent(this,AltaBricolajeActivity.class);
            startActivity(intent);
        });
    }
}
