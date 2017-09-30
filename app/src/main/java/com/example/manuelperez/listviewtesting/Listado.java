package com.example.manuelperez.listviewtesting;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Listado extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Celular> celulares;
    private String marca[], color[];
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        tabla = (TableLayout)findViewById(R.id.tblListado);
        celulares = Datos.obtenerCelulares();
        res = this.getResources();
        marca = res.getStringArray(R.array.marcas);
        color = res.getStringArray(R.array.colores);

        for (int i = 0; i < celulares.size() ; i++) {
            TableRow fila = new TableRow(this);

            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);

            c1.setText("" + (i+1));
            c2.setText(marca[celulares.get(i).getMarca()]);
            c3.setText(color[celulares.get(i).getColor()]);
            c4.setText("" + celulares.get(i).getCapacidadRAM());
            c5.setText("" + celulares.get(i).getPrecio());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            fila.addView(c5);

            tabla.addView(fila);
        }
    }
}
