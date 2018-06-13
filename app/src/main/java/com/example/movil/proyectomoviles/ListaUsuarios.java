package com.example.movil.proyectomoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class ListaUsuarios extends AppCompatActivity {

    private ListView listUser;
    String[] arrUser;
    CrearCuenta crearCuenta=new CrearCuenta();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuarios);

        listUser= (ListView)findViewById(R.id.idListaUser);

        mostrarLista();
        onItemParaConsultar();
    }
    public void mostrarLista() {
        Toast.makeText(getApplicationContext(), "EL VALOR DE LA VARIABLE ES " + crearCuenta.getListaUsuario().size(), Toast.LENGTH_LONG).show();

        arrUser = new String[crearCuenta.getListaUsuario().size()];
        for (int i = 0; i < arrUser.length; i++) {
            arrUser[i] = crearCuenta.getListaUsuario().get(i).getCorreo();
        }
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrUser);
        listUser.setAdapter(adaptador);

    }

    public void onItemParaConsultar() {

        listUser.setClickable(true);
        listUser.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                        }
        });
    }
}
