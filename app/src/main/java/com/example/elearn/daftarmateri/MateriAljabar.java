package com.example.elearn.daftarmateri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.MainActivity;
import com.example.elearn.R;
import com.example.elearn.daftarmateri.contohsoal.ContohAljabar;

public class MateriAljabar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_aljabar);
    }

    public void VContohAljabar(View view) {
        Intent IntContohAljabar = new Intent(MateriAljabar.this, ContohAljabar.class);
        startActivity(IntContohAljabar);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(MateriAljabar.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}