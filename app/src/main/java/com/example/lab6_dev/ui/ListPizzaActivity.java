package com.example.lab6_dev.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab6_dev.R;
import com.example.lab6_dev.adapter.PizzaAdapter;
import com.example.lab6_dev.classes.Produit;
import com.example.lab6_dev.service.ProduitService;

import java.util.List;

public class ListPizzaActivity extends AppCompatActivity {

    private ListView listViewPizzas;
    private ProduitService servicePizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        // Ajouter un padding supérieur pour la navbar
        int actionBarHeight = 0;
        if (getSupportActionBar() != null) {
            actionBarHeight = getSupportActionBar().getHeight();
        }

        // Ou utiliser la valeur standard
        int actionBarHeightDefault = (int) (56 * getResources().getDisplayMetrics().density); // 56dp en pixels

        listViewPizzas = findViewById(R.id.lv_pizzas);
        listViewPizzas.setPadding(0, actionBarHeightDefault + 8, 0, 0); // Padding top

        servicePizzas = ProduitService.getInstance();

        List<Produit> pizzas = servicePizzas.trouverTous();
        PizzaAdapter adaptateur = new PizzaAdapter(this, pizzas);
        listViewPizzas.setAdapter(adaptateur);

        listViewPizzas.setOnItemClickListener((parent, vue, position, id) -> {
            Intent intention = new Intent(ListPizzaActivity.this, PizzaDetailActivity.class);
            intention.putExtra("id_pizza", id);
            startActivity(intention);
        });
    }
}