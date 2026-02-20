package com.example.lab6_dev.classes;

public class Produit {
    private static long compteurId = 1;

    private long id;
    private String nom;
    private double prix;
    private int imageRes;
    private String duree;
    private String ingredients;
    private String description;
    private String etapes;

    public Produit() {
        this.id = compteurId++;
    }

    public Produit(String nom, double prix, int imageRes, String duree,
                   String ingredients, String description, String etapes) {
        this.id = compteurId++;
        this.nom = nom;
        this.prix = prix;
        this.imageRes = imageRes;
        this.duree = duree;
        this.ingredients = ingredients;
        this.description = description;
        this.etapes = etapes;
    }

    // Getters
    public long getId() { return id; }
    public String getNom() { return nom; }
    public double getPrix() { return prix; }
    public int getImageRes() { return imageRes; }
    public String getDuree() { return duree; }
    public String getIngredients() { return ingredients; }
    public String getDescription() { return description; }
    public String getEtapes() { return etapes; }

    // Setters
    public void setNom(String nom) { this.nom = nom; }
    public void setPrix(double prix) { this.prix = prix; }
    public void setImageRes(int imageRes) { this.imageRes = imageRes; }
    public void setDuree(String duree) { this.duree = duree; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }
    public void setDescription(String description) { this.description = description; }
    public void setEtapes(String etapes) { this.etapes = etapes; }
}