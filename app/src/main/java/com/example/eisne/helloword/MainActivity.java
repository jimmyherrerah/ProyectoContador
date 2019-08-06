package com.example.eisne.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mas, menos, reset;
    TextView Valor;
    EditText NuevoValor;
    int NValor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NValor = 0;
        mas = findViewById(R.id.btnMas);
        menos = findViewById(R.id.btnMenos);
        reset = findViewById(R.id.btnResetear);
        Valor = findViewById(R.id.txtValor);
        NuevoValor = findViewById(R.id.txtNuevoValor);
        NuevoValor.setText("0");
        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Integer.parseInt(String.valueOf(NuevoValor.getText()))!=0){
                    NValor=Integer.parseInt(String.valueOf(NuevoValor.getText()))+1;
                    Valor.setText(String.valueOf(NValor));
                    NuevoValor.setText(String.valueOf(NValor));
                } else {
                    NValor++;
                    Valor.setText(String.valueOf(NValor));
                }

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NuevoValor.setText("0");
                Valor.setText("0");
                NValor=0;
            }
        });
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NValor=Integer.parseInt(String.valueOf(Valor.getText()))-1;
                Valor.setText(String.valueOf(NValor));
            }
        });

    }


}
