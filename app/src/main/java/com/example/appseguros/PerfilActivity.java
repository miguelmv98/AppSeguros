package com.example.appseguros;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {
    Button actualizarPerfilButton;
    Button cerrarSesionButton;
    private TextView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        backButton = findViewById(R.id.textAtrasPerfil);
        backButton.setOnClickListener(v -> {
            this.finish();
        });

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