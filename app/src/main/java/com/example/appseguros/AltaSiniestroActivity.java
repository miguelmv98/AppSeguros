package com.example.appseguros;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class AltaSiniestroActivity extends AppCompatActivity {
    private androidx.constraintlayout.widget.ConstraintLayout homeButton;
    private TextView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alta_siniestro);

        homeButton = findViewById(R.id.homeButtonSiniestro);
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(AltaSiniestroActivity.this,HomeActivity.class);
            startActivity(intent);
        });

        backButton = findViewById(R.id.textAtrasSiniestro);
        homeButton.setOnClickListener(v -> {
            this.finish();
        });


    }
}
