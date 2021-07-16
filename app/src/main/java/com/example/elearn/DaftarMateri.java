package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.daftarmateri.MateriAljabar;
import com.example.elearn.daftarmateri.MateriBilangan;
import com.example.elearn.daftarmateri.MateriHimpunan;
import com.example.elearn.daftarmateri.MateriPersamaanPertidaksamaan;

public class DaftarMateri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_materi);
    }

    public void Bilangan(View view) {
        Intent Bilangan = new Intent(DaftarMateri.this, MateriBilangan.class);
        startActivity(Bilangan);
    }

    public void Himpunan(View view) {
        Intent Himpunan = new Intent(DaftarMateri.this, MateriHimpunan.class);
        startActivity(Himpunan);
    }

    public void Aljabar(View view) {
        Intent Aljabar = new Intent(DaftarMateri.this, MateriAljabar.class);
        startActivity(Aljabar);
    }

    public void PersamaanPertidaksamaan(View view) {
        Intent PersamaanPertidaksamaan = new Intent(DaftarMateri.this, MateriPersamaanPertidaksamaan.class);
        startActivity(PersamaanPertidaksamaan);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(DaftarMateri.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}