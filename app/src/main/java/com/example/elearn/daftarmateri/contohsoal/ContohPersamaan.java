package com.example.elearn.daftarmateri.contohsoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.MainActivity;
import com.example.elearn.R;

public class ContohPersamaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_persamaan);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(ContohPersamaan.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}