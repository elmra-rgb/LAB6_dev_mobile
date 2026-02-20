package com.example.lab6_dev.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab6_dev.R;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Cacher l'ActionBar pour un splash screen plein écran
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // Délai de 2 secondes puis lancement de la liste
        new Handler().postDelayed(() -> {
            Intent intention = new Intent(SplashActivity.this, ListPizzaActivity.class);
            startActivity(intention);
            finish(); // Ferme le splash screen
        }, 2000);
    }
}