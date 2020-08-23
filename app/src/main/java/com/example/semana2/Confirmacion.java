package com.example.semana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirmacion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        TextView txtNombre = (TextView) findViewById(R.id.txtName);
        TextView txtTel = (TextView) findViewById(R.id.txtTel);
        TextView txtFecha = (TextView) findViewById(R.id.txtFecha);
        TextView txtDescripcion = (TextView) findViewById(R.id.txtDescription);
        TextView txtMail = (TextView) findViewById(R.id.txtMail);

        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString("NOMBRE");
        String tel = parametros.getString("TELEFONO");
        String mail = parametros.getString("MAIL");
        String descripcion = parametros.getString("DESCRIPCION");
        String fecha = parametros.getString("FECHA");



        txtNombre.setText(nombre);
        txtTel.setText("Tel: "+ tel);
        txtMail.setText(mail);
        txtFecha.setText("Cumple: "+fecha);
        txtDescripcion.setText(descripcion);

        Button btnEditar = (Button) findViewById(R.id.btnConfirmar);

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}