package com.example.appseguros;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {
    Button actualizarPerfilButton;
    Button cerrarSesionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        actualizarPerfilButton = findViewById(R.id.ActualizarPerfilButton);
        actualizarPerfilButton.setOnClickListener(v -> {
            Intent intent = new Intent(PerfilActivity.this,ActualizarPerfilActivity.class);
            startActivity(intent);
        });

        cerrarSesionButton = findViewById(R.id.CerrarSesionButton);
        cerrarSesionButton.setOnClickListener(v -> {
            Intent intent = new Intent(PerfilActivity.this,MainActivity.class);
            startActivity(intent);
        });
    }
}