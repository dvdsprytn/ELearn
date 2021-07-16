package com.example.elearn.daftarmateri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.MainActivity;
import com.example.elearn.R;
import com.example.elearn.daftarmateri.contohsoal.ContohPersamaan;

public class MateriPersamaanPertidaksamaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_persamaan_pertidaksamaan);

    }

    public void VContohPersamaan(View view) {
        Intent IntContohPersamaan = new Intent(MateriPersamaanPertidaksamaan.this, ContohPersamaan.class);
        startActivity(IntContohPersamaan);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(MateriPersamaanPertidaksamaan.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}