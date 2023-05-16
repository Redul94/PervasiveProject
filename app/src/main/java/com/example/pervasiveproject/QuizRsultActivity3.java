package com.example.pervasiveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizRsultActivity3 extends AppCompatActivity {
    TextView outputView;
    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_rsult3);

        Intent myGetIntent = getIntent();


        value=getIntent().getIntExtra("score",0);
        outputView=findViewById(R.id.outputViewId);
        outputView.setText("values: "+value);
        System.out.println("Temp: " + value);
    }

    public void tryFunction(View view) {
        Intent myIntent = new Intent(this,QuizActivity3.class);
        startActivity(myIntent);
    }
}