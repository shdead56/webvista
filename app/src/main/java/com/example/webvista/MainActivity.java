package com.example.webvista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=findViewById(R.id.editTextTextPersonName);

    }

    public void buscar(View view) {
        Intent i=new Intent(this,actiweb.class);
        i.putExtra("SitioWeb",txt1.getText().toString());
        startActivity(i);
    }
}