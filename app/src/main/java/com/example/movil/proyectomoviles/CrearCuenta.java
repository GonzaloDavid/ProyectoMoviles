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
    }
    public void llenarListaUsuarios()
    {
        listaUsuario.add(new Usuarios(Integer.parseInt(id.getText().toString()),nombre.getText().toString(),edad.getText().toString(),correo.getText().toString(),password.getText().toString(),confPassword.getText().toString()));

        nombreBienvenido+=nombre.getText().toString();
        setNombreBienvenido(nombreBienvenido);
        Toast.makeText(getApplicationContext(),"USUARIO AGREGADO: "+getNombreBienvenido(), Toast.LENGTH_SHORT).show();

    }
    public void ImprimirLista()
    {
        Toast.makeText(getApplicationContext(),"Salio 0 :(: "+getListaUsuario().size(), Toast.LENGTH_SHORT).show();
        for (int i=0;i<getListaUsuario().size();i++)
        {
            Toast.makeText(getApplicationContext(),"Imprimir lista: "+getListaUsuario().get(i).getCorreo(), Toast.LENGTH_SHORT).show();
        }
    }

    public void llamarBienvenido(View view)
    {
       // ObtenerDatos();
       // llenarListaUsuarios();
        listaUsuario.add(new Usuarios(1,"Gonzalo david","22","davidgonzalomejia@hotmail.com","gon8529","gon8529"));
        ImprimirLista();
        Intent intent=new Intent(this,InicioSesion.class);
        startActivity(intent);
    }
    public ArrayList<Usuarios> getListaUsuario() {
        return listaUsuario;
    }


}
