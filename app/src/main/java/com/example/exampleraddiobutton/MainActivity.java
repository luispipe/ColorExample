package com.example.exampleraddiobutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
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

        LinearLayout circle2= findViewById(R.id.layoutCircle);


        boton1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                boton2.setChecked(false);
                button.setBackgroundColor(getColor(R.color.blue));
                circle2.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton1.setChecked(false);
                button.setBackgroundColor(getColor(R.color.red));
                circle2.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF1100")));
            }
        });


    }

}