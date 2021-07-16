package com.example.elearn.daftarmateri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.MainActivity;
import com.example.elearn.R;
import com.example.elearn.daftarmateri.contohsoal.ContohHimpunan;

public class MateriHimpunan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_himpunan);
    }

    public void VContohHimpunan(View view) {
        Intent IntContohHimpunan = new Intent(MateriHimpunan.this, ContohHimpunan.class);
        startActivity(IntContohHimpunan);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(MateriHimpunan.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}