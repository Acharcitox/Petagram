package com.acharcitox.petagram;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;

import com.acharcitox.petagram.adapters.MascotaAdaptador;
import com.acharcitox.petagram.clases.Mascota;

import java.util.ArrayList;

public class ListadoMascotas extends AppCompatActivity {

    private ArrayList <Mascota> mascotas = new ArrayList<Mascota>();
    private RecyclerView listaMascotas;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado_mascotas);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.actionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mascotas.add(new Mascota(R.drawable.icon_perro, "Cucho", 15));
        mascotas.add(new Mascota(R.drawable.icon_perro1, "Micho", 16));
        mascotas.add(new Mascota(R.drawable.icon_perro2, "Paco", 5));
        mascotas.add(new Mascota(R.drawable.icon_perro3, "Pepa", 17));
        mascotas.add(new Mascota(R.drawable.icon_perro4, "Flora", 20));

        listaMascotas = (RecyclerView) findViewById(R.id.rv5Mascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarAdaptador();


    }
    private void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

}