package com.example.exampleraddiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //traer los elementos
        RadioButton boton1= findViewById(R.id.radioButtonBlue);
        RadioButton boton2= findViewById(R.id.radioButtonRed);
        Button button= findViewById(R.id.button);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton2.setChecked(false);
                button.setBackgroundColor(getColor(R.color.blue));
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton1.setChecked(false);
                button.setBackgroundColor(getColor(R.color.red));
            }
        });


    }
}