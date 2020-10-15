package com.acharcitox.petagram;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ArrayList <Mascota> mascotas = new ArrayList<Mascota>();
    private RecyclerView listaMascotas;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.actionBar);

        mascotas.add(new Mascota(R.drawable.icon_perro, "Cucho", 15,false));
        mascotas.add(new Mascota(R.drawable.icon_perro1, "Micho", 16,true));
        mascotas.add(new Mascota(R.drawable.icon_perro2, "Paco", 5,false));
        mascotas.add(new Mascota(R.drawable.icon_perro3, "Pepa", 17,true));
        mascotas.add(new Mascota(R.drawable.icon_perro4, "Flora", 20,false));

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarAdaptador();

    }

    private void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }
    public void ir5mascoras(){
        Intent i = new Intent(this, ListadoMascotas.class);
        startActivity(i);
    }
}