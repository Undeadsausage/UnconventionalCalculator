package com.example.unconventionalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Result;
    TextView calculator;
    EditText Equation;
    EditText NumberTxt;
    Button Add;
    Button Mult;
    Button Div;
    Button Minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Result = (TextView) findViewById(R.id.Result);
        calculator = (TextView) findViewById(R.id.Calculatortxt);
        Equation = (EditText) findViewById(R.id.EquationTxt);
        NumberTxt = (EditText) findViewById(R.id.numberTxt);
        Add = (Button) findViewById(R.id.Add);
        Minus = (Button) findViewById(R.id.Sub);
        Mult = (Button) findViewById(R.id.Multiply);
        Div = (Button) findViewById(R.id.Divide);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String input1 = Equation.getText().toString();
                //String input2 = NumberTxt.getText();

                double input1 = Double.parseDouble(Equation.getText().toString());
                double input2 = Double.parseDouble(NumberTxt.getText().toString());
                double sum = input1 + input2;

                Result.setText(String.valueOf(sum));
            }
        });

        Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double input1 = Double.parseDouble(Equation.getText().toString());
                double input2 = Double.parseDouble(NumberTxt.getText().toString());
                double sum = input1 - input2;

                Result.setText(String.valueOf(sum));


            }

        });

        Mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double input1 = Double.parseDouble(Equation.getText().toString());
                double input2 = Double.parseDouble(NumberTxt.getText().toString());
                double sum = input1 * input2;

                Result.setText(String.valueOf(sum));
             }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double input1 = Double.parseDouble(Equation.getText().toString());
                double input2 = Double.parseDouble(NumberTxt.getText().toString());
                double sum = input1 / input2;

                Result.setText(String.valueOf(sum));

            }
        });

    }
}
