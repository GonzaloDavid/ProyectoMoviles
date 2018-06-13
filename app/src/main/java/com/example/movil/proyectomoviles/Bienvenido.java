package com.example.movil.proyectomoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Bienvenido extends AppCompatActivity {
    CrearCuenta crearCuenta=new CrearCuenta();
    TextView colocar;
    String nombreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);
        colocarNombreBienvenido();
    }
    public void colocarNombreBienvenido()
    {
            nombreB = "hola: "+crearCuenta.getNombreBienvenido();
            colocar=findViewById(R.id.tvnombre);
            colocar.setText(nombreB);
            Toast.makeText(getApplicationContext(), "EL VALOR DE LA VARIABLE ES " + nombreB, Toast.LENGTH_LONG).show();

    }
    public void llamarAdministrar(View view)
    {
        Intent intent=new Intent(this,Administrar.class);
        startActivity(intent);
    } public void llamarLista(View view)
    {
        Intent intent=new Intent(this,ListaUsuarios.class);
        startActivity(intent);
    }

}
