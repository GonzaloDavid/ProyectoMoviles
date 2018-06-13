package com.example.movil.proyectomoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class CrearCuenta extends AppCompatActivity {

    EditText id,nombre,edad,correo,password,confPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }
    public void ObtenerDatos()
    {

    }
}
