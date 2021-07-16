package com.example.elearn.latihansoal.kunci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.MainActivity;
import com.example.elearn.R;
import com.example.elearn.artikel.ArtikelLengkapTiga;

public class KunciBilangan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kunci_bilangan);
    }
    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(KunciBilangan.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}