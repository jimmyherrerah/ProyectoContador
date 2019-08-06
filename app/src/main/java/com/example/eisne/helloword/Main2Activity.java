package com.example.eisne.helloword;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button btnContador;
    Button btnRadioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnContador = findViewById(R.id.btnContador);
        btnRadioButton = findViewById(R.id.btnRadioButton);
        btnContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contador = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(contador);
            }
        });
        btnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent radioButton = new Intent(getApplicationContext(), RadioButton.class);
                startActivity(radioButton);
            }
        });
    }
}
