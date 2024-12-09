package com.jah.amuedo_hidalgo_jaime_exmane_tema5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class AdaptadorEstudiante extends RecyclerView.Adapter<AdaptadorEstudiante.HolderEstudiante>{

    List<Estudiante> dataSet;
    Context context;
    Estudiante e;

    public AdaptadorEstudiante(List<Estudiante> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public AdaptadorEstudiante.HolderEstudiante onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.cardview, parent, false);
        return new HolderEstudiante(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorEstudiante.HolderEstudiante holder, int position) {
        e = dataSet.get(position);

        holder.lblNombre.setText(e.getNombre());
        holder.lblCiclo.setText(e.getCiclo());
        holder.lblEdad.setText(String.valueOf(e.getEdad()));
        holder.cvCard.setOnClickListener(view -> verWebView(holder.getAdapterPosition()));
        holder.cvCard.setOnLongClickListener(view -> {
            verPaginaWeb(holder.getAdapterPosition());
            return true;
        });

    }

    private void verPaginaWeb(int posicion) {
        String url = "https://fpaspasia.com/category/" + dataSet.get(posicion).getCiclo();
        Uri enlace = Uri.parse(url);
        Intent verWeb = new Intent(Intent.ACTION_VIEW, enlace);
        context.startActivity(verWeb);
    }

    private void verWebView(int posicion) {
        Intent verView = new Intent(context, VerWebView.class);
        String url = "https://fpaspasia.com/category/" + dataSet.get(posicion).getCiclo();
        verView.putExtra("url", url);
        context.startActivity(verView);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class HolderEstudiante extends RecyclerView.ViewHolder {

        TextView lblNombre, lblEdad, lblCiclo;
        MaterialCardView cvCard;

        public HolderEstudiante(@NonNull View itemView) {
            super(itemView);
            lblNombre = itemView.findViewById(R.id.lblNombre);
            lblEdad = itemView.findViewById(R.id.lblEdad);
            lblCiclo = itemView.findViewById(R.id.lblCiclo);
            cvCard = itemView.findViewById(R.id.cvCard);
        }
    }
}
