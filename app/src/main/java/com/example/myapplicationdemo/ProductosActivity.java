package com.example.myapplicationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class ProductosActivity extends AppCompatActivity {

    private EditText nombreProducto, pagarMonto;
    private CheckBox checkBox;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        nombreProducto = (EditText)findViewById(R.id.editTextNombreProducto);
        pagarMonto = (EditText)findViewById(R.id.editTextPagarMonto);
        checkBox = (CheckBox)findViewById(R.id.checkBoxEnvio);
        text = (TextView)findViewById(R.id.textViewProducto);
    }

    public void Calcular (View v){
        // Deberá realizar el cálculo según lo que yo ingrese en PAGAR MONTO si la LAVADORA cuesta
        // 129.000 e Ingreso 100.000 deberá mostrar la deuda de 29.000. si pago completamente el
        // producto deberá mostrar en el TEXTVIEW que el producto ha sido pagado.
        //Televisor 129.000 14.500
        //microondas 50.000 5.500
        //lavadora 100.000/ 25.000
        int value;
        int monto;
        String product;
        product = nombreProducto.getText().toString().toLowerCase();
        try {
            monto = Integer.parseInt(pagarMonto.getText().toString());
        }catch (Exception e){
            text.setText("Ingrese monto");
            return;
        };
        switch (product){
            case "televisor":
                value = (checkBox.isChecked()) ? 129000 + 14500 : 129000;
                break;
            case "microondas":
                value = (checkBox.isChecked()) ? 50000 + 5500 : 50000;
                break;
            case "lavadora":
                value = (checkBox.isChecked()) ? 100000 + 25000 : 100000;
                break;
            default:
                text.setText("Item no encontrado");
                return;
        }
        if(value<monto)
            text.setText("Pagado, cambio: $" + String.valueOf(monto - value));
        else if(value == monto)
            text.setText("Pagado");
        else
            text.setText("Deuda: $" + String.valueOf(value - monto));
    }

}