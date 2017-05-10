package com.example.jhonny.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.btn_ingresar);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent cambioAct = new Intent(this, Main2Activity.class);
        startActivities(cambioAct);
    }

}
