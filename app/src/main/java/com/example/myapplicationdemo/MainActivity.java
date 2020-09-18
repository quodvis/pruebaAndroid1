package com.example.myapplicationdemo;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.editTextName);
        password = (EditText)findViewById(R.id.editTextPassword);
    }


    public void Iniciar(View v){
        String a = name.getText().toString();
        String b = password.getText().toString();
        Intent i = new Intent(this, MenuAct.class);

        if ( a.equalsIgnoreCase( "android" ) && b.equalsIgnoreCase( "123") ){
            startActivity(i);
        }

    }



}