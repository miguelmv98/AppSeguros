package com.example.appseguros;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActualizarPerfilActivity extends AppCompatActivity {
    Button actualizarButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_perfil);

        actualizarButton = findViewById(R.id.btnActualizarPerfil);
        actualizarButton.setOnClickListener(v -> {
            Intent intent = new Intent(ActualizarPerfilActivity.this,PerfilActivity.class);
            startActivity(intent);
        });
    }
}