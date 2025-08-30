package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class GuitarraFragment extends Fragment {

    List<Guitarra> lstGuitarra;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_guitarra, container, false);


        return view;
    }

    lstGuitarra = new ArrayList<>();
        lstGuitarra.add(new Guitarra(R.drawable.guitarra_allblack, "guitarra all black"));
        lstGuitarra.add(new Guitarra(R.drawable.guitarra_azul, "guitarra azul"));
        lstGuitarra.add(new Guitarra(R.drawable.guitarra_branca, "guitarra branca"));
        lstGuitarra.add(new Guitarra(R.drawable.guitarra_madeira, "guitarra madeira"));
        lstGuitarra.add(new Guitarra(R.drawable.guitarra_strinberg, "guitarra strinberg"));
        lstGuitarra.add(new Guitarra(R.drawable.guitarra_vermelha, "guitarra vermelha"));

    idRecyclerViewGuitarra = findViewById(R.id.idRecyclerViewGuitarra);

    AdaptadorGuitarra adapter = new AdaptadorGuitarra(getApplicationContext(),lstGuitarra);

    idToolBarItens = findViewById(R.id.idToolBarItens);

    idViewPagerItensGuitarra = findViewById(R.id.idViewPagerItensGuitarra);

    idTabLayoutItensGuitar = findViewById(R.id.idTabLayoutItensGuitar);

}