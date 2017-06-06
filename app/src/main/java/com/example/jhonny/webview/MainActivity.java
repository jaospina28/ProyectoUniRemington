package com.example.jhonny.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    EditText correo;
    EditText clave;
    Spinner spinner;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (ToggleButton)findViewById(R.id.toggle);
        correo = (EditText)findViewById(R.id.correo);
        clave = (EditText)findViewById(R.id.clave);
        button = (Button)findViewById(R.id.btn_ingresar);
        button.setOnClickListener(this);
        spinner = (Spinner) findViewById(R.id.eleccion);

        String[] eleccion = { "Administrativos", "Docentes - Tutores", "Estudiantes" };

        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_dropdown_item_1line, eleccion);
        spinner.setAdapter(arrayAdapter);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    String cor;
                    String cla;
                    if(String.valueOf(spinner.getSelectedItem()).equals("Estudiantes")){
                        cor = "estudiante@uniremingtonmanizales.edu.co";
                        cla = "123456";
                        Toast.makeText(MainActivity.this, "Correo: " + cor + " Clave: " + cla, Toast.LENGTH_LONG).show();
                    }else if(String.valueOf(spinner.getSelectedItem()).equals("Docentes - Tutores")){
                        cor = "docente@uniremingtonmanizales.edu.co";
                        cla = "123456";
                        Toast.makeText(MainActivity.this, "Correo: " + cor + " Clave: " + cla, Toast.LENGTH_LONG).show();
                    }else if(String.valueOf(spinner.getSelectedItem()).equals("Administrativos")){
                        cor = "administrativo@uniremingtonmanizales.edu.co";
                        cla = "123456";
                        Toast.makeText(MainActivity.this, "Correo: " + cor + " Clave: " + cla, Toast.LENGTH_LONG).show();
                    }
                }else{
                    //Toast.makeText(MainActivity.this, "No oprimido", Toast.LENGTH_SHORT).show();
                }
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Perfil seleccionado: " + String.valueOf(spinner.getSelectedItem()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public void onClick(View v) {

        String correo_v = correo.getText().toString();
        String clave_v = clave.getText().toString();

        if(String.valueOf(spinner.getSelectedItem()).equals("Estudiantes")){
            if(correo_v.equals("estudiante@uniremingtonmanizales.edu.co")){
                if(clave_v.equals("123456")){
                    Intent cambioAct = new Intent(this, Main2Activity.class);
                    startActivity(cambioAct);
                }else{
                    Toast.makeText(MainActivity.this, "Error en contraseña", Toast.LENGTH_SHORT).show();
                }

            }else{
                Toast.makeText(MainActivity.this, "Error en correo", Toast.LENGTH_SHORT).show();
            }
        }else if(String.valueOf(spinner.getSelectedItem()).equals("Docentes - Tutores")){
            if(correo_v.equals("docente@uniremingtonmanizales.edu.co")){
                if(clave_v.equals("123456")){
                    Intent cambioAct = new Intent(this, Main4Activity.class);
                    startActivity(cambioAct);
                }else{
                    Toast.makeText(MainActivity.this, "Error en contraseña", Toast.LENGTH_SHORT).show();
                }

            }else{
                Toast.makeText(MainActivity.this, "Error en correo", Toast.LENGTH_SHORT).show();
            }
        }else if(String.valueOf(spinner.getSelectedItem()).equals("Administrativos")){
            if(correo_v.equals("administrativo@uniremingtonmanizales.edu.co")){
                if(clave_v.equals("123456")){
                    Intent cambioAct = new Intent(this, Main5Activity.class);
                    startActivity(cambioAct);
                }else{
                    Toast.makeText(MainActivity.this, "Error en contraseña", Toast.LENGTH_SHORT).show();
                }

            }else{
                Toast.makeText(MainActivity.this, "Error en correo", Toast.LENGTH_SHORT).show();
            }
        }

    }

}
