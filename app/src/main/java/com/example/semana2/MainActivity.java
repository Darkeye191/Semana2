package com.example.semana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Calendar;
import android.app.DatePickerDialog;
import android.widget.DatePicker;

import com.google.android.material.textfield.TextInputLayout;


public class MainActivity extends AppCompatActivity {

    TextInputLayout tel1;
    TextInputLayout name1;
    TextInputLayout mail1;
    TextInputLayout description1;
    Button btnSig;
    String nombre;
    String tel;
    String mail;
    String Dscripcion;
    String fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tel1 = (TextInputLayout) findViewById(R.id.tilTel);
        name1 = (TextInputLayout) findViewById(R.id.tilNombre);
        mail1 = (TextInputLayout) findViewById(R.id.tilMail);
        description1 = (TextInputLayout) findViewById(R.id.tilDescripcion);
        btnSig =  (Button) (findViewById(R.id.btnSigguiente));

        btnSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obtenerDatos();
                Intent intent1 = new Intent(MainActivity.this, Confirmacion.class);
                intent1.putExtra("NOMBRE", nombre);
                intent1.putExtra("TELEFONO", tel);
                intent1.putExtra("MAIL", mail);
                intent1.putExtra("DESCRIPCION", Dscripcion);
                intent1.putExtra("FECHA", fecha);
                startActivity(intent1);
            }
        });


    }

    public void obtenerDatos(){
        fecha = obtenerFecha();
        nombre = name1.getEditText().getText().toString();
        tel = tel1.getEditText().getText().toString();
        mail = mail1.getEditText().getText().toString();
        Dscripcion = description1.getEditText().getText().toString();

    }

    public String obtenerFecha(){

        DatePicker datePicker;
        datePicker = (DatePicker) findViewById(R.id.dtpkrFecha);

        int   day  = datePicker.getDayOfMonth();
        int   month= datePicker.getMonth() + 1;
        int   year = datePicker.getYear();

        return String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year) ;
    }
}

