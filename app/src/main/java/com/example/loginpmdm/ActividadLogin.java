package com.example.loginpmdm;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ActividadLogin extends AppCompatActivity {

    EditText nombre;
    EditText contraseña;
    EditText correo;
    Button siguiente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_login);

        nombre = findViewById(R.id.editTextNombre);
        contraseña = findViewById(R.id.editTextContraseña);
        correo = findViewById(R.id.editTextCorreo);

        siguiente = findViewById(R.id.btnLogin);




    }

    public void onClickLoginSiguiente(View view) {

        Intent i = new Intent(this, ActividadFinal.class);

        i.putExtra("nombre", nombre.getText().toString());
        i.putExtra("contraseña", contraseña.getText().toString());
        i.putExtra("correo", correo.getText().toString());
                 startActivity(i);
    }
}