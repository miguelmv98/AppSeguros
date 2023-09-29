package com.example.appseguros;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    androidx.constraintlayout.widget.ConstraintLayout altaBricolajeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        altaBricolajeButton = findViewById(R.id.gestionServicio);
        altaBricolajeButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this,AltaBricolajeActivity.class);
            startActivity(intent);
        });


    }
}
