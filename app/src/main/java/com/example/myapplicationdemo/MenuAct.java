package com.example.myapplicationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuAct extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Productos (View v){
        Intent i = new Intent(this, ProductosActivity.class);
        startActivity(i);
    }

    public void Clientes (View v) {
        Intent i = new Intent(this, ClientesActivity.class);
        startActivity(i);
    }

    public void Comentarios (View v) {
        Intent i = new Intent(this, ComentariosActivity.class);
        startActivity(i);
    }
    public void Info (View v){
        Intent i = new Intent(this, InfoActivity.class);
        startActivity(i);
    }

}