package com.example.appseguros;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class HomeActivity extends AppCompatActivity {
    ConstraintLayout bricolajeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bricolajeButton = findViewById(R.id.gestionServicio);
        bricolajeButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this,AltaBricolajeActivity.class);
            startActivity(intent);
        });

    }
}
