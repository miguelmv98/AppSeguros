package com.example.appseguros;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AltaSiniestroActivity extends AppCompatActivity {


    androidx.constraintlayout.widget.ConstraintLayout homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alta_siniestro);

        homeButton = findViewById(R.id.homeButtonSiniestro);
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(AltaSiniestroActivity.this,HomeActivity.class);
            startActivity(intent);
        });
    }
}
