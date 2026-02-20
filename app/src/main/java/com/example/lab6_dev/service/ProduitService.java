package com.example.lab6_dev.service;

import com.example.lab6_dev.classes.Produit;
import com.example.lab6_dev.dao.IDao;
import com.example.lab6_dev.R;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private static ProduitService instance;
    private final List<Produit> pizzas = new ArrayList<>();

    private ProduitService() {
        initialiserDonnees();
    }

    public static ProduitService getInstance() {
        if (instance == null) {
            instance = new ProduitService();
        }
        return instance;
    }

    private void initialiserDonnees() {
        // Pizza 1 - BARBECUED CHICKEN
        pizzas.add(new Produit(
                "BARBECUED CHICKEN PIZZA",
                3.0,
                R.drawable.pizza1,
                "35 min",
                "• 2 blancs de poulet désossés\n• 1/4 c. à café de poivre\n• 1 tasse de sauce barbecue\n• 1 pâte à pizza réfrigérée\n• 2 c. à café d'huile d'olive\n• 2 tasses de fromage Gouda\n• 1 oignon rouge\n• 1/4 tasse de coriandre",
                "Pizza au poulet barbecue, rapide et savoureuse. Parfaite pour les grillades d'été!",
                "ÉTAPE 1: Griller le poulet avec la sauce barbecue\nÉTAPE 2: Préparer la pâte sur le grill\nÉTAPE 3: Garnir de fromage, poulet et oignon\nÉTAPE 4: Cuire jusqu'à ce que le fromage fonde"
        ));

        // Pizza 2 - BRUSCHETTA
        pizzas.add(new Produit(
                "BRUSCHETTA PIZZA",
                5.0,
                R.drawable.pizza2,
                "35 min",
                "• 250g de saucisse\n• 1 croûte à pizza précuite\n• 1 paquet de pepperoni\n• 2 tasses de mozzarella\n• 1.5 tasse de tomates\n• Basilic frais\n• Huile d'olive\n• 2 gousses d'ail",
                "Pizza généreuse garnie de saucisse, pepperoni et tomates fraîches au basilic.",
                "ÉTAPE 1: Cuire la saucisse\nÉTAPE 2: Garnir de pepperoni, saucisse et fromage\nÉTAPE 3: Cuire à 450°F\nÉTAPE 4: Ajouter le mélange de tomates et basilic"
        ));

        // Pizza 3 - SPINACH
        pizzas.add(new Produit(
                "SPINACH PIZZA",
                2.0,
                R.drawable.pizza3,
                "25 min",
                "• 1 pâte à pizza\n• 1/2 tasse de sauce Alfredo\n• 2 tomates\n• 4 tasses d'épinards frais\n• 2 tasses de fromage italien",
                "Pizza crémeuse aux épinards et tomates, légère et savoureuse.",
                "ÉTAPE 1: Étaler la pâte\nÉTAPE 2: Garnir de sauce Alfredo\nÉTAPE 3: Ajouter épinards, tomates et fromage\nÉTAPE 4: Cuire à 450°F"
        ));

        // Pizza 4 - DEEP-DISH SAUSAGE
        pizzas.add(new Produit(
                "DEEP-DISH SAUSAGE PIZZA",
                8.0,
                R.drawable.pizza4,
                "45 min",
                "• 1 sachet de levure\n• 2/3 tasse d'eau tiède\n• 1.75 tasse de farine\n• 1/4 tasse d'huile\n• Herbes italiennes\n• Sel d'ail et d'oignon",
                "Pizza à croûte épaisse, garnie de saucisse, fromage et pepperoni.",
                "ÉTAPE 1: Préparer la pâte et laisser lever\nÉTAPE 2: Étaler dans une poêle\nÉTAPE 3: Garnir de fromage, saucisse\nÉTAPE 4: Cuire au four"
        ));

        // Pizza 5 - HOMEMADE
        pizzas.add(new Produit(
                "HOMEMADE PIZZA",
                4.0,
                R.drawable.pizza5,
                "50 min",
                "• Levure • Sucre • Eau tiède • Huile • Sel • Farine\n• Bœuf haché • Oignon • Sauce tomate • Origan • Basilic • Poivron • Mozzarella",
                "Pizza maison classique, croûte dorée, garnie de bœuf et poivrons.",
                "ÉTAPE 1: Préparer la pâte et laisser lever\nÉTAPE 2: Cuire le bœuf avec l'oignon\nÉTAPE 3: Étaler et garnir\nÉTAPE 4: Cuire 25-30 minutes"
        ));

        // Pizza 6 - PESTO CHICKEN
        pizzas.add(new Produit(
                "PESTO CHICKEN PIZZA",
                3.0,
                R.drawable.pizza6,
                "50 min",
                "• Levure • Eau tiède • Farine • Huile d'olive • Sucre • Sel\n• Poulet • Oignon • Poivrons • Champignons • Pesto • Mozzarella",
                "Pizza au pesto, poulet grillé et légumes colorés.",
                "ÉTAPE 1: Préparer la pâte\nÉTAPE 2: Cuire poulet et légumes\nÉTAPE 3: Étaler le pesto\nÉTAPE 4: Garnir et cuire 18-20 minutes"
        ));

        // Pizza 7 - LOADED MEXICAN
        pizzas.add(new Produit(
                "LOADED MEXICAN PIZZA",
                3.0,
                R.drawable.pizza7,
                "30 min",
                "• Haricots noirs • Oignon rouge • Poivron • Chili • Cumin\n• Tomates • Jalapeno • Ail • Croûte à pizza • Épinards • Cheddar • Pepper jack",
                "Pizza tex-mex épicée aux haricots, tomates et fromage.",
                "ÉTAPE 1: Écraser les haricots avec épices\nÉTAPE 2: Étaler sur la croûte\nÉTAPE 3: Garnir de tomates, épinards, fromage\nÉTAPE 4: Cuire 12-15 minutes"
        ));

        // Pizza 8 - BACON CHEESEBURGER
        pizzas.add(new Produit(
                "BACON CHEESEBURGER PIZZA",
                2.0,
                R.drawable.pizza8,
                "20 min",
                "• Bœuf haché • Oignon • Croûte précuite • Sauce pizza\n• Bacon • Cornichons • Mozzarella • Cheddar • Assaisonnement",
                "Pizza façon cheeseburger, garnie de bœuf, bacon et cornichons.",
                "ÉTAPE 1: Cuire le bœuf avec l'oignon\nÉTAPE 2: Garnir de sauce, bœuf, bacon\nÉTAPE 3: Ajouter cornichons et fromages\nÉTAPE 4: Cuire 8-10 minutes"
        ));

        // Pizza 9 - MARGHERITA
        pizzas.add(new Produit(
                "PIZZA MARGHERITA",
                1.0,
                R.drawable.pizza9,
                "30 min",
                "• Levure • Eau tiède • Huile d'olive • Sucre • Sel • Farine\n• Tomates fraîches • Basilic • Mozzarella",
                "La pizza italienne classique: tomate, mozzarella, basilic.",
                "ÉTAPE 1: Préparer la pâte et laisser lever\nÉTAPE 2: Diviser et étaler\nÉTAPE 3: Garnir de tomates, basilic, fromage\nÉTAPE 4: Cuire 15-20 minutes"
        ));

        // Pizza 10 - STUFFED
        pizzas.add(new Produit(
                "PEPPERONI-SAUSAGE STUFFED PIZZA",
                5.0,
                R.drawable.pizza10,
                "45 min",
                "• Levure • Eau tiède • Huile d'olive • Sel • Sucre • Farine\n• Fromages • Saucisse • Champignons • Pepperoni",
                "Pizza farcie, remplie de fromage, saucisse et pepperoni.",
                "ÉTAPE 1: Préparer la pâte\nÉTAPE 2: Diviser en trois\nÉTAPE 3: Garnir de fromage et viandes\nÉTAPE 4: Refermer et cuire"
        ));
    }

    @Override
    public Produit creer(Produit item) {
        pizzas.add(item);
        return item;
    }

    @Override
    public Produit modifier(Produit item) {
        for (int i = 0; i < pizzas.size(); i++) {
            if (pizzas.get(i).getId() == item.getId()) {
                pizzas.set(i, item);
                return item;
            }
        }
        return null;
    }

    @Override
    public boolean supprimer(long id) {
        return pizzas.removeIf(p -> p.getId() == id);
    }

    @Override
    public Produit trouverParId(long id) {
        for (Produit p : pizzas) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Produit> trouverTous() {
        return new ArrayList<>(pizzas);
    }
}