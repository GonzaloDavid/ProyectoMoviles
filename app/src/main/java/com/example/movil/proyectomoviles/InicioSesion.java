package com.example.movil.proyectomoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class InicioSesion extends AppCompatActivity {

    CrearCuenta crearCuenta=new CrearCuenta();
    EditText correo,password,confirPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
    }
    public void ObtenerDatosInicioSesion()
    {
       // crearCuenta=(EditText) findViewById(R.id.)
    }
}
