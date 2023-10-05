package com.example.appseguros;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    androidx.constraintlayout.widget.ConstraintLayout altaBricolajeButton;
    androidx.constraintlayout.widget.ConstraintLayout altaSiniestroButton;
    androidx.constraintlayout.widget.ConstraintLayout HistorialButton;

    ImageView profilePic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        altaBricolajeButton = findViewById(R.id.gestionServicio);
        altaBricolajeButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this,AltaBricolajeActivity.class);
            startActivity(intent);
        });

        altaSiniestroButton = findViewById(R.id.gestionSiniestro);
        altaSiniestroButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this,AltaSiniestroActivity.class);
            startActivity(intent);
        });

        HistorialButton = findViewById(R.id.historialSolicitudes);
        HistorialButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this,HistorialBricolajeActivity.class);
            startActivity(intent);
        });

        profilePic = findViewById(R.id.profilePick);
        profilePic.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this,PerfilActivity.class);
            startActivity(intent);
        });


    }
}
