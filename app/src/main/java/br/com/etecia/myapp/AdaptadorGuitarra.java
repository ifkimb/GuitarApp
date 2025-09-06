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

public class AdaptadorGuitarra extends RecyclerView.Adapter<AdaptadorGuitarra.ViewHolder> {
    private Context context;
    private List<Guitarra> lstGuitarra;

    public AdaptadorGuitarra(Context context, List<Guitarra> lstGuitarra) {
        this.context = context;
        this.lstGuitarra = lstGuitarra;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);

        view = inflater.inflate(R.layout.modelo_guitarra, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idTituloGuitarra.setText(lstGuitarra.get(position).getTituloGuitarra());
        holder.imgCardGuitarra.setImageResource(lstGuitarra.get(position).getImgCardGuitarra());
    }

    @Override
    public int getItemCount() {
        return lstGuitarra.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgCardGuitarra;

        TextView idTituloGuitarra;




        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCardGuitarra = itemView.findViewById(R.id.imgCardGuitarra);
            idTituloGuitarra = itemView.findViewById(R.id.idTituloGuitarra);
        }
    }
}
