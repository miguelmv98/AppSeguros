package com.example.appseguros;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActualizarPerfilActivity extends AppCompatActivity {
    Button actualizarButton;

    private TextView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_perfil);

        actualizarButton = findViewById(R.id.btnActualizarPerfil);
        actualizarButton.setOnClickListener(v -> {
            Intent intent = new Intent(ActualizarPerfilActivity.this,PerfilActivity.class);
            startActivity(intent);
        });

        backButton = findViewById(R.id.textAtrasActualizarPerfil);
        backButton.setOnClickListener(v -> {
            this.finish();
        });
    }
}