package br.com.etecia.myapp;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorAcessorios extends RecyclerView.Adapter<AdaptadorAcessorios.ViewHolder> {

    private Context context;

    private List<Acessorios> lstAcessorios;

    public AdaptadorAcessorios(Context context, List<Acessorios> lstAcessorios){
        this.context = context;
        this.lstAcessorios = lstAcessorios;
    }


    @NonNull
    @Override
    public AdaptadorAcessorios.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorAcessorios.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
