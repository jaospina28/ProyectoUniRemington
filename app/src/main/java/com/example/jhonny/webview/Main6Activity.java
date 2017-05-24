package com.example.jhonny.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity implements View.OnClickListener{

    RadioGroup colores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        colores = (RadioGroup) findViewById(R.id.radiocolor);
        colores.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.azul){
                    PonerColores(0);
                }
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    //FUNCION QUE PONE LOS COLORES A LOS TEXTVIEW

    public void PonerColores(int color){

        TextView text = new TextView(this);
        text.setTextColor(getResources().getColor(R.color.azul));

    }
}
