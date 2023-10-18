package com.example.appseguros;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;

public class AltaSiniestroActivity extends AppCompatActivity {
    private androidx.constraintlayout.widget.ConstraintLayout homeButton;
    private TextView backButton;
    Button cancelar;

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

        cancelar = findViewById(R.id.CancelarSieniestro);
        cancelar.setOnClickListener(v -> {
            Intent intent = new Intent(this,HomeActivity.class);
            startActivity(intent);
        });
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, VisualizarDatosSiniestroAcitivity.class);
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra("ClaveDomicilio", ((TextInputLayout) (findViewById(R.id.InputDomicilioSiniestro))).getEditText().getText().toString());
        intent.putExtra("ClaveDescripcion", ((TextInputLayout ) (findViewById(R.id.InputDescripcionSiniestro))).getEditText().getText().toString());
        intent.putExtra("ClaveFecha", ((TextInputLayout ) (findViewById(R.id.InputFechaSiniestro))).getEditText().getText().toString());
        intent.putExtra("ClaveHora", ((TextInputLayout ) (findViewById(R.id.InputHoraSiniestro))).getEditText().getText().toString());
        startActivity(intent);
    }
}
