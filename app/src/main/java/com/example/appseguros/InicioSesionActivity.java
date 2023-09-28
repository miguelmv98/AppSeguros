package com.example.appseguros;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class InicioSesionActivity extends AppCompatActivity {
    TextView registerTextView;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        registerTextView = findViewById(R.id.txtRegistrateAqui);
        registerTextView.setOnClickListener(v -> {
            Intent intent = new Intent(InicioSesionActivity.this,RegistroActivity.class);
            startActivity(intent);
        });

        loginButton = findViewById(R.id.btnInicioSesion);
        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(InicioSesionActivity.this,HomeActivity.class);
            startActivity(intent);
        });
    }
}
