package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class LojaFragment extends Fragment {

    RecyclerView idRecyclerViewLoja;

    List<Loja> lstLoja;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_loja, container, false);

        idRecyclerViewLoja = view.findViewById(R.id.idRecyclerViewLoja);

        lstLoja = new ArrayList<>();
        lstLoja.add(new Loja());

        return view;
    }
}