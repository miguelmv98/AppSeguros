package com.example.appseguros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class HistorialBricolajeActivity extends AppCompatActivity {

    androidx.constraintlayout.widget.ConstraintLayout homeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_bricolaje);

        homeButton = findViewById(R.id.homeButtonSiniestro);
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this,HomeActivity.class);
            startActivity(intent);
        });
    }
}