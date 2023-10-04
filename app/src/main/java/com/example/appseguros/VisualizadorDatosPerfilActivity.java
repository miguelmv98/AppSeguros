package com.example.appseguros;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VisualizadorDatosPerfilActivity extends AppCompatActivity {

    androidx.constraintlayout.widget.ConstraintLayout homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizador_info_perfil);

        Intent intent = getIntent();

        String mensajeNombre=intent.getStringExtra("ClaveNombre");
        String mensajeApellidos=intent.getStringExtra("ClaveApellidos");
        String mensajeDomicilio=intent.getStringExtra("ClaveDomicilio");
        String mensajeDNI=intent.getStringExtra("ClaveDNI");
        String mensajeCorreo=intent.getStringExtra("ClaveEmail");
        String mensajeBanco=intent.getStringExtra("ClaveCuentaBancaria");


        ((TextView)findViewById(R.id.textNombre)).setText("Nombre: "+mensajeNombre);
        ((TextView)findViewById(R.id.textApellidos)).setText("Apellidos: "+mensajeApellidos);
        ((TextView)findViewById(R.id.textDomicilio)).setText("Domicilio: "+mensajeDomicilio);
        ((TextView)findViewById(R.id.textDNI)).setText("DNI: "+mensajeDNI);
        ((TextView)findViewById(R.id.textEmail)).setText("Correo electrónico: "+mensajeCorreo);
        ((TextView)findViewById(R.id.textCuentaBancaria)).setText("Cuenta bancaria: "+mensajeBanco);

        homeButton = findViewById(R.id.homeButtonVisualizador);
        homeButton.setOnClickListener(v -> {
            Intent intent2 = new Intent(VisualizadorDatosPerfilActivity.this,MainActivity.class);
            startActivity(intent2);
        });

    }
}
