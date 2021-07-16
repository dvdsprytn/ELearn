package com.example.elearn.latihansoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.MainActivity;
import com.example.elearn.R;
import com.example.elearn.latihansoal.kunci.KunciPersamaan;

public class LatihanSoalPersamaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_soal_persamaan);
    }

    public void VKunciPersamaan(View view) {
        Intent IntKunciPersamaan = new Intent(LatihanSoalPersamaan.this, KunciPersamaan.class);
        startActivity(IntKunciPersamaan);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(LatihanSoalPersamaan.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}