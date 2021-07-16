package com.example.elearn.latihansoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.MainActivity;
import com.example.elearn.R;
import com.example.elearn.latihansoal.kunci.KunciAljabar;

public class LatihanSoalAljabar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_soal_aljabar);

    }

    public void VKunciAljabar(View view) {
        Intent IntKunciAljabar = new Intent(LatihanSoalAljabar.this, KunciAljabar.class);
        startActivity(IntKunciAljabar);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(LatihanSoalAljabar.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}