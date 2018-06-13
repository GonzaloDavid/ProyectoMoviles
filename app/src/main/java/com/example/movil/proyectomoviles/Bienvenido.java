package com.example.movil.proyectomoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
    public void llamarAdministrar(View view)
    {
        Intent intent=new Intent(this,Administrar.class);
        startActivity(intent);
    }
}
