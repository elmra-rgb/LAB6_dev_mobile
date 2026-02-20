package com.example.lab6_dev.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab6_dev.R;
import com.example.lab6_dev.classes.Produit;
import com.example.lab6_dev.service.ProduitService;

public class PizzaDetailActivity extends AppCompatActivity {

    private Produit pizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        // Initialiser les vues
        ImageView imagePizza = findViewById(R.id.img_pizza);
        TextView titrePizza = findViewById(R.id.titre_pizza);
        TextView metaPizza = findViewById(R.id.meta_pizza);
        TextView ingredientsPizza = findViewById(R.id.ingredients_pizza);
        TextView descriptionPizza = findViewById(R.id.description_pizza);
        TextView etapesPizza = findViewById(R.id.etapes_pizza);
        ImageButton btnPartager = findViewById(R.id.btn_partager);

        // Récupérer l'ID de la pizza
        long idPizza = getIntent().getLongExtra("id_pizza", -1);
        pizza = ProduitService.getInstance().trouverParId(idPizza);

        if (pizza != null) {
            // Afficher les informations
            imagePizza.setImageResource(pizza.getImageRes());
            titrePizza.setText(pizza.getNom());
            metaPizza.setText(pizza.getDuree() + " • " + pizza.getPrix() + " €");
            ingredientsPizza.setText(pizza.getIngredients());
            descriptionPizza.setText(pizza.getDescription());
            etapesPizza.setText(pizza.getEtapes());

            // Configurer le bouton de partage
            btnPartager.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    partagerRecette();
                }
            });
        }
    }

    private void partagerRecette() {
        if (pizza == null) return;

        // Créer le texte à partager
        String textePartage = "🍕 Découvrez cette délicieuse recette !\n\n" +
                "📌 " + pizza.getNom() + "\n" +
                "⏱️ " + pizza.getDuree() + "\n" +
                "💰 " + pizza.getPrix() + " €\n\n" +
                "📝 Ingrédients:\n" + pizza.getIngredients() + "\n\n" +
                "👨‍🍳 Étapes:\n" + pizza.getEtapes() + "\n\n" +
                "Partagé via Pizza Recipes App";

        // Intent de partage
        Intent intentPartage = new Intent(Intent.ACTION_SEND);
        intentPartage.setType("text/plain");
        intentPartage.putExtra(Intent.EXTRA_SUBJECT, "Recette: " + pizza.getNom());
        intentPartage.putExtra(Intent.EXTRA_TEXT, textePartage);

        // Lancer le choix de l'application de partage
        startActivity(Intent.createChooser(intentPartage, "Partager la recette via"));

        // Feedback optionnel
        Toast.makeText(this, "Partage en cours...", Toast.LENGTH_SHORT).show();
    }
}