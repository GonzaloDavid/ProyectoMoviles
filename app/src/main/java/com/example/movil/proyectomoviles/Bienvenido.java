package com.example.movil.proyectomoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Bienvenido extends AppCompatActivity {
    CrearCuenta crearCuenta=new CrearCuenta();
    String nombreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);
    }
    public void colocarNombreBienvenido()
    {
        nombreB=crearCuenta.getNombreBienvenido();

    }
}
