package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class GuitarraFragment extends Fragment {

    RecyclerView idRecyclerViewGuitarra;

    List<Guitarra> lstGuitarra;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guitarra, container, false);

        idRecyclerViewGuitarra = view.findViewById(R.id.idRecyclerViewGuitarra);

        lstGuitarra = new ArrayList<>();
        lstGuitarra.add(new Guitarra(R.drawable.guitarra_allblack, "guitarra all black"));
        lstGuitarra.add(new Guitarra(R.drawable.guitarra_azul, "guitarra azul"));
        lstGuitarra.add(new Guitarra(R.drawable.guitarra_branca, "guitarra branca"));
        lstGuitarra.add(new Guitarra(R.drawable.guitarra_madeira, "guitarra madeira"));
        lstGuitarra.add(new Guitarra(R.drawable.guitarra_strinberg, "guitarra strinberg"));
        lstGuitarra.add(new Guitarra(R.drawable.guitarra_vermelha, "guitarra vermelha"));

        AdaptadorGuitarra adapter = new AdaptadorGuitarra(getContext(), lstGuitarra);

        idRecyclerViewGuitarra.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        idRecyclerViewGuitarra.setAdapter(adapter);

        return view;
    }


}