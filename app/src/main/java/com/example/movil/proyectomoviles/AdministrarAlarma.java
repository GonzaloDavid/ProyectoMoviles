package com.example.movil.proyectomoviles;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

public class AdministrarAlarma extends AppCompatActivity {

    private Spinner spinner1;
    JSONObject json = new JSONObject();
    JSONObject manJson = new JSONObject();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrar_alarma);
    }
    public void crearJson(String accion)
    {
        try {
            manJson.put("name", "Alarma");
            manJson.put("accion", accion);
            json.put("tipoControl",manJson);
        }catch (Exception e )
        {

        }
    }
    public void MostrarDatosJson()
    {
        try{
            for (int i=0;i<json.length();i++)
            {
                MostrarDatosAlert(json.toString());
            }
        }catch (Exception e){

            Toast.makeText(getApplicationContext(), "Hay una exepcion :(" , Toast.LENGTH_LONG).show();
        }

    }
    public void MostrarDatosAlert(String mensaje){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(mensaje).setTitle("MENSAJE")
                .setCancelable(false)
                .setNeutralButton("Aceptar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
    public void MetodoPost()
    {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        String URL = getResources().getString(R.string.url_web);


        final String mRequestBody = json.toString();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.i("LOG_VOLLEY", response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("LOG_VOLLEY", error.toString());
            }
        }) {
            @Override
            public String getBodyContentType() {
                return "application/json; charset=utf-8";
            }

            @Override
            public byte[] getBody() throws AuthFailureError {
                try {
                    return mRequestBody == null ? null : mRequestBody.getBytes("utf-8");
                } catch (UnsupportedEncodingException uee) {
                    VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", mRequestBody, "utf-8");
                    return null;
                }
            }

            @Override
            protected Response<String> parseNetworkResponse(NetworkResponse response) {
                String responseString = "";
                if (response != null) {

                    responseString = String.valueOf(response.statusCode);

                }
                return Response.success(responseString, HttpHeaderParser.parseCacheHeaders(response));

            }
        };

        requestQueue.add(stringRequest);
    }
    public void EscogerAccionAlarma()
    {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        crearJson(spinner1.getSelectedItem().toString());
        MostrarDatosJson();

    }
    public void MandarPeticion(View view)
    {
        EscogerAccionAlarma();
        MetodoPost();
    }
}
