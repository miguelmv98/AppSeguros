package com.example.appseguros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HistorialSiniestrosActivity extends AppCompatActivity {
    androidx.constraintlayout.widget.ConstraintLayout homeButton;
    Button historialSiniestroButton;
    Button historialBricolajeButton;
    private TextView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_siniestros);

        backButton = findViewById(R.id.textAtrasHistorialSiniestro);
        backButton.setOnClickListener(v -> {
            this.finish();
        });

        homeButton = findViewById(R.id.homeButtonSiniestro);
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this,HomeActivity.class);
            startActivity(intent);
        });

        historialSiniestroButton = findViewById(R.id.botonSiniestros);
        historialSiniestroButton.setOnClickListener(v -> {
            Intent intent = new Intent(this,HistorialSiniestrosActivity.class);
            startActivity(intent);
        });

        historialBricolajeButton = findViewById(R.id.botonBricolaje);
        historialBricolajeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this,HistorialBricolajeActivity.class);
            startActivity(intent);
        });
    }
}