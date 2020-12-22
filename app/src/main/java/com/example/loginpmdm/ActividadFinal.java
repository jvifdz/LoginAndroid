package com.example.loginpmdm;

import android.content.Intent;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ActividadFinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_final);


        Intent i = getIntent();
        if (i!=null){
            String nombre= i.getStringExtra("nombre");
            String contraseña= i.getStringExtra("contraseña");
            String correo= i.getStringExtra("correo");
            if (nombre!=null){
                Toast.makeText(this,"nombre: "+nombre+" contraseña: "+contraseña+" correo: "+correo,Toast.LENGTH_LONG).show();}
        }
    }
}