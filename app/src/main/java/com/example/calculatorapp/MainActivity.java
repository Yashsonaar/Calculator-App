package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private EditText e1;
    private EditText e2;
    private TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        v = findViewById(R.id.tw);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v.setText(" ");
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.length()==0 || s2.length()==0)
                {
                    Toast.makeText(MainActivity.this, "Enter values..", Toast.LENGTH_SHORT).show();
                }
                else {
                    double ad = Double.parseDouble(e1.getText().toString()) + Double.parseDouble(e2.getText().toString());
                    v.setText("Answer is " + ad);
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v.setText(" ");
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.length()==0 || s2.length()==0)
                {
                    Toast.makeText(MainActivity.this, "Enter values..", Toast.LENGTH_SHORT).show();
                }
                else {
                    double sub = Double.parseDouble(e1.getText().toString()) - Double.parseDouble(e2.getText().toString());
                    v.setText("Answer is "+sub);
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v.setText(" ");
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.length()==0 || s2.length()==0)
                {
                    Toast.makeText(MainActivity.this, "Enter values..", Toast.LENGTH_SHORT).show();
                }
                else {
                    double mult = Double.parseDouble(e1.getText().toString())*Double.parseDouble(e2.getText().toString());
                    v.setText("Answer is "+mult);
                }

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                v.setText(" ");
                if(s1.length()==0 || s2.length()==0)
                {
                    Toast.makeText(MainActivity.this, "Enter values..", Toast.LENGTH_SHORT).show();
                }
                else {
                    double n1 = Double.parseDouble(s1);
                    double n2 = Double.parseDouble(s2);
                    if(n2==0)
                        Toast.makeText(MainActivity.this, "Cannot divide by Zero !", Toast.LENGTH_SHORT).show();
                    else
                        v.setText("Answer is "+ (n1/n2));
                }

            }
        });
    }
}