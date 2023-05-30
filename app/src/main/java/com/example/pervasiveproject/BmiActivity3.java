package com.example.pervasiveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BmiActivity3 extends AppCompatActivity {
    EditText h, w;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi3);
        h = findViewById(R.id.heightId);
        w = findViewById(R.id.widthId);
        output = findViewById(R.id.outputId);
    }
    public void CalBMI(View view) {
        double hd = Double.parseDouble(h.getText().toString());
        double bmi = Double.parseDouble(w.getText().toString())/ Math.pow(hd/100, 2);
        output.setText("BMI: "+bmi);
    }
}