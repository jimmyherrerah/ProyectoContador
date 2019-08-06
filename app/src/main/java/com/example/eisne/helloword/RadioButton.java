package com.example.eisne.helloword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class RadioButton extends AppCompatActivity {

    RadioGroup radioGroup;


    Spinner spinner;

    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.OpcionUno){
                    Toast.makeText(getApplicationContext(),"Has Escogido la opción Uno",Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.OpcionDos){
                    Toast.makeText(getApplicationContext(),"Has escogido la opción Dos", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.OpcionTres){
                    Toast.makeText(getApplicationContext(),"Has escogido la opción Tres", Toast.LENGTH_SHORT).show();
                } else
                {
                    Toast.makeText(getApplicationContext(),"Has escogido la opción Cuatro",Toast.LENGTH_SHORT).show();
                }
            }
        });

        spinner = findViewById(R.id.spinner);

        List list = new ArrayList();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        list.add("Item 6");
        list.add("Item 7");
        list.add("Item 8");
        list.add("Item 9");
        list.add("Item 10");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(RadioButton.this,"Posición " + String.valueOf(spinner.getSelectedItem()),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        toggleButton = findViewById(R.id.toggleButton);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(RadioButton.this,"Verdadero",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(RadioButton.this, "Falso", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
