package com.example.appseguros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class RegistroActivity extends AppCompatActivity {

    Button signinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        signinButton = findViewById(R.id.btnRegistrarse);
        signinButton.setOnClickListener(this::onClick);

    }

    private void onClick(View v) {
        Intent intent = new Intent(RegistroActivity.this, VisualizadorDatosPerfilActivity.class);
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra("ClaveNombre", ((TextInputLayout) (findViewById(R.id.Nombre))).getEditText().getText().toString());
        intent.putExtra("ClaveApellidos", ((TextInputLayout ) (findViewById(R.id.Apellido))).getEditText().getText().toString());
        intent.putExtra("ClaveDomicilio", ((TextInputLayout ) (findViewById(R.id.Domicilio))).getEditText().getText().toString());
        intent.putExtra("ClaveDNI", ((TextInputLayout ) (findViewById(R.id.DNI))).getEditText().getText().toString());
        intent.putExtra("ClaveEmail", ((TextInputLayout ) (findViewById(R.id.Email))).getEditText().getText().toString());
        intent.putExtra("ClaveCuentaBancaria", ((TextInputLayout ) (findViewById(R.id.CuentaBancaria))).getEditText().getText().toString());
        startActivity(intent);
    }
}
