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
    ArrayList <Usuarios> listaUsuario=new ArrayList<>();
    String nombreBienvenido="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
        ObtenerDatos();
    }
    public void ObtenerDatos()
    {
       id=(EditText) findViewById(R.id.eId);
       nombre=(EditText) findViewById(R.id.eNombre);
       edad=(EditText) findViewById(R.id.eEdad);
       correo=(EditText) findViewById(R.id.eCorreoElectronico);
       password=(EditText) findViewById(R.id.ePassword);
       confPassword=(EditText) findViewById(R.id.eConfirPassword);

    }
    public void llenarListaUsuarios()
    {
        listaUsuario.add(new Usuarios(Integer.parseInt(id.getText().toString()),nombre.getText().toString(),edad.getText().toString(),correo.getText().toString(),password.getText().toString(),confPassword.getText().toString()));
        nombreBienvenido=nombre.getText().toString();
        Toast.makeText(getApplicationContext(),"USUARIO AGREGADO: "+nombreBienvenido, Toast.LENGTH_SHORT).show();

    }
    public void llamarBienvenido(View view)
    {
        llenarListaUsuarios();
        Intent intent=new Intent(this,Bienvenido.class);
        startActivity(intent);
    }

    public String getNombreBienvenido() {
        return nombreBienvenido;
    }

}
