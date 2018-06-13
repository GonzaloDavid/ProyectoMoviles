package com.example.movil.proyectomoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InicioSesion extends AppCompatActivity {

    Usuarios usuarios=new Usuarios();
    EditText correo,password;
    String scorreo, spassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

    }
    public void ObtenerDatosInicioSesion()
    {
        correo=(EditText) findViewById(R.id.eiEmail);
        password=(EditText) findViewById(R.id.eiPassword);
        scorreo=correo.getText().toString();
        spassword=password.getText().toString();
       // Toast.makeText(getApplicationContext(),"METODO OBTENER DATOS INICIO SESION: "+spassword, Toast.LENGTH_SHORT).show();
        usuarios.addListaUsuario(1,"Gonzalo","22","davidgonzalomejia@hotmail.com","gon8529","gon8529");
    }

    public boolean validarUsuario()
    {

        boolean ban=false;
        Toast.makeText(getApplicationContext(),"valor de lista: "+usuarios.getListaUsuarios().size(), Toast.LENGTH_SHORT).show();
        for (int i=0;i<usuarios.getListaUsuarios().size();i++)
        {
            if(usuarios.getListaUsuarios().get(i).correo.equals(scorreo))
            {
                if(usuarios.getListaUsuarios().get(i).password.equals(spassword))
                {
                    ban=true;
                    return ban;

                }else
                {
                    ban=false;
                }
                Toast.makeText(getApplicationContext(),"CONTRASEÑA INCORRECTA ", Toast.LENGTH_SHORT).show();
            }else
            {
            ban=false;
            }
            Toast.makeText(getApplicationContext(),"CORREO NO VALIDO", Toast.LENGTH_SHORT).show();
        }

        return ban;
    }
    public void IngresarLogin(View view)
    {
        ObtenerDatosInicioSesion();
       if(validarUsuario()==true)
        {
            Intent intent=new Intent(this,Bienvenido.class);
            startActivity(intent);
        }else
        {
            Toast.makeText(getApplicationContext(),"USUARIO NO REGISTRADO", Toast.LENGTH_SHORT).show();
        }
    }

}
