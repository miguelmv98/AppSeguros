package com.example.appseguros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class AltaBricolajeActivity extends AppCompatActivity  {

    androidx.constraintlayout.widget.ConstraintLayout homeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alta_bricolaje);

        String[] type = new String[] {"Electricidad", "Carpintería", "Fontanería"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.dropdown_item,
                type
        );

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.filled_exposed);
        autoCompleteTextView.setAdapter(adapter);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(AltaBricolajeActivity.this, autoCompleteTextView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        homeButton = findViewById(R.id.homeButtonBricolaje);
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this,HomeActivity.class);
            startActivity(intent);
        });
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, VisualizarDatosBricolajeActivity.class);
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra("ClaveTipo", ((TextInputLayout) (findViewById(R.id.tipo))).getEditText().getText().toString());
        intent.putExtra("ClaveDomicilio", ((TextInputLayout ) (findViewById(R.id.Domicilio))).getEditText().getText().toString());
        intent.putExtra("ClaveDescripcion", ((TextInputLayout ) (findViewById(R.id.Descripcion))).getEditText().getText().toString());
        startActivity(intent);
    }
}