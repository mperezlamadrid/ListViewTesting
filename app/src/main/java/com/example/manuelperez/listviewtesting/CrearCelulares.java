package com.example.manuelperez.listviewtesting;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CrearCelulares extends AppCompatActivity {
    private Spinner marcas, colores;
    private EditText cajaCapacidad, cajaPrecio;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celulares);

        marcas = (Spinner) findViewById(R.id.cmbMarca);
        colores = (Spinner)findViewById(R.id.cmbColor);
        cajaCapacidad = (EditText)findViewById(R.id.txtRAM);
        cajaPrecio = (EditText)findViewById(R.id.txtPrecio);

        res = this.getResources();

        String opm[] = res.getStringArray(R.array.marcas);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opm);
        marcas.setAdapter(adapter);

        String opc[] = res.getStringArray(R.array.colores);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opc);
        colores.setAdapter(adapter1);
    }

    public void crear(View v){
        int marca, color;
        double ram, precio;

        marca = marcas.getSelectedItemPosition();
        color = colores.getSelectedItemPosition();
        ram = Double.parseDouble(cajaCapacidad.getText().toString());
        precio = Double.parseDouble(cajaPrecio.getText().toString());

        Celular c = new Celular(marca, color, ram, precio);
        c.guardar();

        Toast.makeText(this, res.getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
        limpiar();
    }

    public void limpiar(View v){
        limpiar();
    }

    private void limpiar(){
        marcas.setSelection(0);
        colores.setSelection(0);
        cajaCapacidad.setText("");
        cajaPrecio.setText("");
    }
}
