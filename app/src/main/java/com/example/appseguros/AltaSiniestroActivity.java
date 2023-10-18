package com.example.appseguros;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class AltaSiniestroActivity extends AppCompatActivity {
    private androidx.constraintlayout.widget.ConstraintLayout homeButton;

    private Button inputImage;
    private TextView backButton;
    private Button cancelar;
    private Button agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alta_siniestro);

        homeButton = findViewById(R.id.homeButtonSiniestro);
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(AltaSiniestroActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        backButton = findViewById(R.id.textAtrasSiniestro);
        backButton.setOnClickListener(v -> {
            this.finish();
        });

        ActivityResultLauncher<PickVisualMediaRequest> pickMultipleMedia =
                registerForActivityResult(new ActivityResultContracts.PickMultipleVisualMedia(5), uris -> {
                    if (!uris.isEmpty()) {
                        Log.d("PhotoPicker", "Number of items selected: " + uris.size());
                    } else {
                        Log.d("PhotoPicker", "No media selected");
                    }
                });
        cancelar = findViewById(R.id.CancelarSieniestro);
        cancelar.setOnClickListener(v -> {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        });

        inputImage = findViewById(R.id.InputImagenSiniestro);
        inputImage.setOnClickListener(v -> {

            pickMultipleMedia.launch(new PickVisualMediaRequest.Builder()
                    .build());
        });

        agregar = findViewById(R.id.AgregarSiniestro);
        agregar.setOnClickListener(v -> {
            Intent intent = new Intent(this, VisualizarDatosSiniestroAcitivity.class);
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra("ClaveDomicilio", ((TextInputLayout) (findViewById(R.id.InputDomicilioSiniestro))).getEditText().getText().toString());
            intent.putExtra("ClaveDescripcion", ((TextInputLayout ) (findViewById(R.id.InputDescripcionSiniestro))).getEditText().getText().toString());
            intent.putExtra("ClaveFecha", ((TextInputLayout ) (findViewById(R.id.InputFechaSiniestro))).getEditText().getText().toString());
            intent.putExtra("ClaveHora", ((TextInputLayout ) (findViewById(R.id.InputHoraSiniestro))).getEditText().getText().toString());
            startActivity(intent);
        });



    }
}
