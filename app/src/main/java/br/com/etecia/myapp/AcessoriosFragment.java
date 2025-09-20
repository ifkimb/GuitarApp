package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class AcessoriosFragment extends Fragment {

    RecyclerView idRecyclerViewAcessorios;
    List<Acessorios> lstAcessorios;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_acessorios, container, false);

        idRecyclerViewAcessorios = view.findViewById(R.id.idRecyclerViewAcessorios);
        lstAcessorios = new ArrayList<>();
        lstAcessorios.add(new Acessorios(R.drawable.cabo,"CaboSA"));
        lstAcessorios.add(new Acessorios(R.drawable.corda,"Corda"));
        lstAcessorios.add(new Acessorios(R.drawable.correia,"Correia"));
        lstAcessorios.add(new Acessorios(R.drawable.cortador,"Cortador de corda"));
        lstAcessorios.add(new Acessorios(R.drawable.amplificador,"Amplificador"));
        lstAcessorios.add(new Acessorios(R.drawable.slide,"Slide"));

        AdaptadorAcessorios adapter = new AdaptadorAcessorios(getContext(), lstAcessorios);


        return view;
    }
}