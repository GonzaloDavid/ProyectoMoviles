package com.example.movil.proyectomoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class CrearCuenta extends AppCompatActivity {

    EditText id,nombre,edad,correo,password,confPassword;
    String nombreBienvenido="";
    Usuarios usuarios=new Usuarios();


    public void setNombreBienvenido(String nombreBienvenido) {
        this.nombreBienvenido = nombreBienvenido;
    }
    public String getNombreBienvenido() {
        return nombreBienvenido;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }
    public void ObtenerDatos()
    {
       id=(EditText) findViewById(R.id.eId);
       nombre=(EditText) findViewById(R.id.eNombre);
       edad=(EditText) findViewById(R.id.eEdad);
       correo=(EditText) findViewById(R.id.eCorreoElectronico);
       password=(EditText) findViewById(R.id.ePassword);
       confPassword=(EditText) findViewById(R.id.eConfirPassword);
        setNombreBienvenido(nombre.getText().toString());
        usuarios.addListaUsuario(Integer.parseInt(id.getText().toString()),nombre.getText().toString(),edad.getText().toString(),correo.getText().toString(),password.getText().toString(),confPassword.getText().toString());
    }

       public void llamarInicioSesion(View view)
    {
        ObtenerDatos();
        Intent intent=new Intent(this,InicioSesion.class);
        startActivity(intent);
    }


}
