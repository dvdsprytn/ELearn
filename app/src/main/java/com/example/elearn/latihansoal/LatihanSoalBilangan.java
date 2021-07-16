package com.example.elearn.latihansoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.MainActivity;
import com.example.elearn.R;
import com.example.elearn.latihansoal.kunci.KunciBilangan;

public class LatihanSoalBilangan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_soal_bilangan);
    }

    public void VKunciBilangan(View view) {
        Intent IntKunciBilangan = new Intent(LatihanSoalBilangan.this, KunciBilangan.class);
        startActivity(IntKunciBilangan);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(LatihanSoalBilangan.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}