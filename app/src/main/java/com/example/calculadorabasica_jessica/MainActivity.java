package com.example.calculadorabasica_jessica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText numero1;
    EditText numero2;
    TextView resultado;
    Button buttonSuma;
    Button buttonResta;
    Button buttonMultiplicacion;
    Button buttondivision;
    Button buttonResultado;
    Button buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        resultado = findViewById(R.id.resultado);
        buttonSuma = findViewById(R.id.buttonSuma);
        buttonResta = findViewById(R.id.buttonResta);
        buttonMultiplicacion = findViewById(R.id.buttonMultiplicacion);
        buttondivision = findViewById(R.id.buttonDivision);
        buttonReset = findViewById(R.id.buttonReset);


        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText((String.valueOf(Integer.parseInt(numero1.getText().toString())+(Integer.parseInt(numero2.getText().toString())))));
            }
        });
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText((String.valueOf(Integer.parseInt(numero1.getText().toString())-(Integer.parseInt(numero2.getText().toString())))));
            }
        });
        buttonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText((String.valueOf(Integer.parseInt(numero1.getText().toString())*(Integer.parseInt(numero2.getText().toString())))));

            }
        });
        buttondivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText((String.valueOf(Integer.parseInt(numero1.getText().toString())/(Integer.parseInt(numero2.getText().toString())))));

            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("0");
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}