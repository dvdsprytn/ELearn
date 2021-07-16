package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.latihansoal.LatihanSoalAljabar;
import com.example.elearn.latihansoal.LatihanSoalBilangan;
import com.example.elearn.latihansoal.LatihanSoalHimpunan;
import com.example.elearn.latihansoal.LatihanSoalPersamaan;

public class DaftarLatihanSoal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_latihan_soal);
    }

    public void VLatBilangan(View view) {
        Intent IntLatBilangan = new Intent(DaftarLatihanSoal.this, LatihanSoalBilangan.class);
        startActivity(IntLatBilangan);
    }

    public void VLatHimpunan(View view) {
        Intent IntLatHimpunan = new Intent(DaftarLatihanSoal.this, LatihanSoalHimpunan.class);
        startActivity(IntLatHimpunan);
    }

    public void VLatAljabar(View view) {
        Intent IntLatAljabar = new Intent(DaftarLatihanSoal.this, LatihanSoalAljabar.class);
        startActivity(IntLatAljabar);
    }

    public void VLatPersamaan(View view) {
        Intent IntLatPersamaan = new Intent(DaftarLatihanSoal.this, LatihanSoalPersamaan.class);
        startActivity(IntLatPersamaan);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(DaftarLatihanSoal.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}