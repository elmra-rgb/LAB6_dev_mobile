package com.example.lab6_dev.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lab6_dev.R;
import com.example.lab6_dev.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private final Context contexte;
    private final List<Produit> listePizzas;
    private final LayoutInflater inflateur;

    public PizzaAdapter(Context contexte, List<Produit> listePizzas) {
        this.contexte = contexte;
        this.listePizzas = listePizzas;
        this.inflateur = LayoutInflater.from(contexte);
    }

    @Override
    public int getCount() {
        return listePizzas.size();
    }

    @Override
    public Object getItem(int position) {
        return listePizzas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listePizzas.get(position).getId();
    }

    @Override
    public View getView(int position, View vueRecyclee, ViewGroup parent) {
        if (vueRecyclee == null) {
            vueRecyclee = inflateur.inflate(R.layout.item_pizza, parent, false);
        }

        ImageView imagePizza = vueRecyclee.findViewById(R.id.image_pizza);
        TextView nomPizza = vueRecyclee.findViewById(R.id.nom_pizza);
        TextView infoPizza = vueRecyclee.findViewById(R.id.info_pizza);

        Produit pizza = listePizzas.get(position);
        imagePizza.setImageResource(pizza.getImageRes());
        nomPizza.setText(pizza.getNom());
        infoPizza.setText(pizza.getDuree() + " • " + pizza.getPrix() + " €");

        return vueRecyclee;
    }
}