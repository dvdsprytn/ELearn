package com.example.elearn.latihansoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.MainActivity;
import com.example.elearn.R;
import com.example.elearn.latihansoal.kunci.KunciHimpunan;

public class LatihanSoalHimpunan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_soal_himpunan);
    }

    public void VKunciHimpunan(View view) {
        Intent IntKunciHimpunan = new Intent(LatihanSoalHimpunan.this, KunciHimpunan.class);
        startActivity(IntKunciHimpunan);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(LatihanSoalHimpunan.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}