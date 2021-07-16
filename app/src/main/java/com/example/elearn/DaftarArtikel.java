package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.artikel.ArtikelLengkapDua;
import com.example.elearn.artikel.ArtikelLengkapSatu;
import com.example.elearn.artikel.ArtikelLengkapTiga;

public class DaftarArtikel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_artikel);
    }

    public void VArtikel1(View view) {
        Intent IntArtikel1 = new Intent(DaftarArtikel.this, ArtikelLengkapSatu.class);
        startActivity(IntArtikel1);
    }

    public void VArtikel2(View view) {
        Intent IntArtikel2 = new Intent(DaftarArtikel.this, ArtikelLengkapDua.class);
        startActivity(IntArtikel2);
    }

    public void VArtikel3(View view) {
        Intent IntArtikel3 = new Intent(DaftarArtikel.this, ArtikelLengkapTiga.class);
        startActivity(IntArtikel3);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(DaftarArtikel.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}