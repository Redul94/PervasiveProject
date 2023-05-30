package com.example.pervasiveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class UsdToBdtActivity3 extends AppCompatActivity {
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usd_to_bdt3);
        editText = findViewById(R.id.input);
        textView= findViewById(R.id.output);
    }
    public void pressPrint(View view) {
        String output = editText.getText().toString();
        double usd = Double.parseDouble(output);
        textView.setText("BDT: "+usd*115);
    }
}