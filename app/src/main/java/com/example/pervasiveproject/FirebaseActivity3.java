package com.example.pervasiveproject;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class FirebaseActivity3 extends AppCompatActivity {
    EditText u_name,u_id;
    FirebaseDatabase database;
    DatabaseReference myRef;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase3);

    }


    public void showListFunction(View view) {
        u_name=findViewById(R.id.nameId);
        u_id = findViewById(R.id.passId);

        String id = u_id.getText().toString().trim();
        String name = u_name.getText().toString().trim();


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("List");

//        myRef.setValue(id.getText().toString());

    }
}

