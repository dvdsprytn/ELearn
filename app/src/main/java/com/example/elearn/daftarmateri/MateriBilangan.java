package com.example.elearn.daftarmateri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.MainActivity;
import com.example.elearn.R;
import com.example.elearn.daftarmateri.contohsoal.ContohBilangan;

public class MateriBilangan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_bilangan);

    }

    public void VContohBilangan(View view) {
        Intent IntContohBilangan = new Intent(MateriBilangan.this, ContohBilangan.class);
        startActivity(IntContohBilangan);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(MateriBilangan.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}