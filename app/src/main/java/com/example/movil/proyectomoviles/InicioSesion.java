package com.example.movil.proyectomoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InicioSesion extends AppCompatActivity {

    CrearCuenta crearCuenta=new CrearCuenta();
    EditText correo,password;
    String scorreo, spassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        ObtenerDatosInicioSesion();
    }
    public void ObtenerDatosInicioSesion()
    {
        correo=(EditText) findViewById(R.id.eiEmail);
        password=(EditText) findViewById(R.id.eiPassword);
        scorreo=correo.getText().toString();
        spassword=password.getText().toString();
    }
    public void ValidarUsuarioValido(View view)
    {
        for (int i=0;i<crearCuenta.listaUsuario.size();i++)
        {
            if(crearCuenta.listaUsuario.get(i).correo.equals(scorreo))
            {
                if(crearCuenta.listaUsuario.get(i).password.equals(spassword))
                {
                    Intent intent=new Intent(this,Bienvenido.class);
                    startActivity(intent);

                }
                Toast.makeText(getApplicationContext(),"CONTRASEÑA INCORRECTA ", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(getApplicationContext(),"USUARIO NO REGISTRADO", Toast.LENGTH_SHORT).show();
        }
    }
}
