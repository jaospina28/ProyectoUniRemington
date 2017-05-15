package com.example.jhonny.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    EditText correo;
    EditText clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correo = (EditText)findViewById(R.id.correo);
        clave = (EditText)findViewById(R.id.clave);
        button = (Button)findViewById(R.id.btn_ingresar);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String correo_v = correo.getText().toString();
        String clave_v = clave.getText().toString();

        if(correo_v.equals("jaospinal@uniremingtonmanizales.edu.co")){
            if(clave_v.equals("123456")){
                Intent cambioAct = new Intent(this, Main2Activity.class);
                startActivity(cambioAct);
            }else{
                Toast.makeText(MainActivity.this, "Error en contraseña", Toast.LENGTH_SHORT).show();
            }

        }else{
            Toast.makeText(MainActivity.this, "Error en usuario", Toast.LENGTH_SHORT).show();
        }


    }

}
