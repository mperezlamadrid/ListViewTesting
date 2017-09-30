package com.example.manuelperez.listviewtesting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    private ListView lstOpciones;
    private Resources res;
    private String opc[];
    private Intent i;
    private Context contexto;
    private String color[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lstOpciones = (ListView)findViewById(R.id.lstOpciones);
        res = this.getResources();
        contexto = this;
        color = res.getStringArray(R.array.colores);

        opc = res.getStringArray(R.array.opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc);

        lstOpciones.setAdapter(adapter);
        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case 0:
                    i = new Intent(Principal.this, CrearCelulares.class);
                    startActivity(i);
                    break;
                case 1:
                    i = new Intent(Principal.this, Listado.class);
                    startActivity(i);
                    break;
                case 2:
                    ArrayList<Celular> celulares = Metodos.marca_samsung_2_a_4_ram(Datos.obtenerCelulares());
                    String mostrar = "";
                    for (int j = 0; j < celulares.size(); j++) {
                        mostrar += "[" + color[celulares.get(j).getColor()] + ", " + celulares.get(j).getCapacidadRAM() + ", " + celulares.get(j).getPrecio()+ "]";
                    }
                    Toast.makeText(contexto, mostrar, Toast.LENGTH_LONG).show();
                    break;
                case 3:
                    Toast.makeText(contexto, Metodos.cuantos_apples_negros(Datos.obtenerCelulares())+"", Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    Toast.makeText(contexto, Metodos.precio_promedio_nokias(Datos.obtenerCelulares())+"", Toast.LENGTH_SHORT).show();
                    break;
            }
            }
        });
    }
}
