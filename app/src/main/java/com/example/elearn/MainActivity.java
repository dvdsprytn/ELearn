package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void VDaftarMateri(View view) {
        Intent IntMateri = new Intent(MainActivity.this, DaftarMateri.class);
        startActivity(IntMateri);
    }

    public void VDaftarLatihanSoal(View view) {
        Intent IntLatihanSoal = new Intent(MainActivity.this, DaftarLatihanSoal.class);
        startActivity(IntLatihanSoal);
    }

    public void VDaftarArtikel(View view) {
        Intent IntDaftarArtikel = new Intent(MainActivity.this, DaftarArtikel.class);
        startActivity(IntDaftarArtikel);
    }

    public void VBantuan(View view) {
        Intent IntBantuan = new Intent(MainActivity.this, Bantuan.class);
        startActivity(IntBantuan);
    }

    public void VTentangKami(View view) {
        Intent IntTentangKami = new Intent(MainActivity.this, TentangKami.class);
        startActivity(IntTentangKami);
    }
}