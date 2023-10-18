package com.example.appseguros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class VisualizarDatosBricolajeActivity extends AppCompatActivity {

    androidx.constraintlayout.widget.ConstraintLayout homeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_datos_bricolaje);

        Intent intent = getIntent();

        String mensajeTipo=intent.getStringExtra("ClaveTipo");
        String mensajeDomicilio=intent.getStringExtra("ClaveDomicilio");
        String mensajeDescripcion=intent.getStringExtra("ClaveDescripcion");


        ((TextView)findViewById(R.id.textTipo)).setText("Nombre: "+ mensajeTipo);
        ((TextView)findViewById(R.id.textDomicilio)).setText("Domicilio: "+ mensajeDomicilio);
        ((TextView)findViewById(R.id.textDescripcion)).setText("Descripcion: "+ mensajeDescripcion);

        homeButton = findViewById(R.id.homeButtonVisualizador);
        homeButton.setOnClickListener(v -> {
            Intent intent2 = new Intent(this,HomeActivity.class);
            startActivity(intent2);
        });
    }
}