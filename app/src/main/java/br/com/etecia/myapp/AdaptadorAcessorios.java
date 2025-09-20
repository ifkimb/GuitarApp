package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorAcessorios extends RecyclerView.Adapter<AdaptadorAcessorios.ViewHolder> {

    private Context context;
    private List<Acessorios> lstAcessorios;

    public AdaptadorAcessorios(Context context, List<Acessorios> lstAcessorios) {
        this.context = context;
        this.lstAcessorios = lstAcessorios;
    }

    @NonNull
    @Override
    public AdaptadorAcessorios.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);

        view = inflater.inflate(R.layout.modelo_acessorios, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorAcessorios.ViewHolder holder, int position) {
        holder.idTituloCardAcessorios.setText(lstAcessorios.get(position).getIdTituloAcessorios());
        holder.imgCardAcessorios.setImageResource(lstAcessorios.get(position).getImgCardAcessorios());

    }

    @Override
    public int getItemCount() {
        return lstAcessorios.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgCardAcessorios;
        TextView idTituloCardAcessorios;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCardAcessorios = itemView.findViewById(R.id.imgCardAcessorios);
            idTituloCardAcessorios = itemView.findViewById(R.id.idTituloAcessorios);

        }
    }
}