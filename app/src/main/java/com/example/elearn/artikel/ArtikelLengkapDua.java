package com.example.elearn.artikel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.MainActivity;
import com.example.elearn.R;

public class ArtikelLengkapDua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel_lengkap_dua);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(ArtikelLengkapDua.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}