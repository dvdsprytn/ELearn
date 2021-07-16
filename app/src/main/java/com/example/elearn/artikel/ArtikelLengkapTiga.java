package com.example.elearn.artikel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.MainActivity;
import com.example.elearn.R;

public class ArtikelLengkapTiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel_lengkap_tiga);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(ArtikelLengkapTiga.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}