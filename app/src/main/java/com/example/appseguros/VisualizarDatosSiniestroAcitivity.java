package com.example.appseguros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class VisualizarDatosSiniestroAcitivity extends AppCompatActivity {
    androidx.constraintlayout.widget.ConstraintLayout homeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_datos_siniestro);

        Intent intent = getIntent();

        String mensajeDomicilio=intent.getStringExtra("ClaveDomicilio");
        String mensajeDescripcion=intent.getStringExtra("ClaveDescripcion");
        String mensajeFecha=intent.getStringExtra("ClaveFecha");
        String mensajeHora=intent.getStringExtra("ClaveHora");


        ((TextView)findViewById(R.id.textDomicilio)).setText("Domicilio: "+ mensajeDomicilio);
        ((TextView)findViewById(R.id.textDescripcion)).setText("Descripcion: "+ mensajeDescripcion);
        ((TextView)findViewById(R.id.textFecha)).setText("Fecha: "+ mensajeFecha);
        ((TextView)findViewById(R.id.textHora)).setText("Hora: "+ mensajeHora);

        homeButton = findViewById(R.id.homeButtonVisualizador);
        homeButton.setOnClickListener(v -> {
            Intent intent2 = new Intent(this,HomeActivity.class);
            startActivity(intent2);
        });
    }
}