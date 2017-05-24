package com.example.jhonny.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener{

    Button correo;
    Button q10;
    Button directorio;
    Button reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        correo = (Button) findViewById(R.id.btn_correo);
        correo.setOnClickListener(this);
        q10 = (Button) findViewById(R.id.btn_q10);
        q10.setOnClickListener(this);
        directorio = (Button) findViewById(R.id.btn_directorio);
        directorio.setOnClickListener(this);
        reserva = (Button) findViewById(R.id.btn_reserva);
        reserva.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_correo){
            Intent cambioActi3 = new Intent(this, Main3Activity.class);
            String link = "https://accounts.google.com/signin/v2/identifier?continue=http%3A%2F%2Fmail.google.com%2Fa%2Funiremington.edu.co%2F&ltmpl=default&service=mail&sacu=1&hd=uniremington.edu.co&flowName=GlifWebSignIn&flowEntry=Identifier";
            cambioActi3.putExtra("link",link);
            startActivity(cambioActi3);
        }else if(v.getId() == R.id.btn_q10){
            Intent cambioActi3 = new Intent(this, Main3Activity.class);
            String link = "https://www.q10academico.com/login?ReturnUrl=%2F&aplentId=a2e25504-9d7b-4e4e-861a-5f015f373d8f";
            cambioActi3.putExtra("link",link);
            startActivity(cambioActi3);
        }else if(v.getId() == R.id.btn_directorio){
            Intent cambioActi3 = new Intent(this, Main3Activity.class);
            String link = "http://www.uniremington.edu.co/manizales/1445-directorio-administrativo.html";
            cambioActi3.putExtra("link",link);
            startActivity(cambioActi3);
        }else if(v.getId() == R.id.btn_reserva){
            Intent cambioActi3 = new Intent(this, Main3Activity.class);
            String link = "http://reservas.uniremingtonmanizales.edu.co/login.php";
            cambioActi3.putExtra("link",link);
            startActivity(cambioActi3);
        }
    }
}
