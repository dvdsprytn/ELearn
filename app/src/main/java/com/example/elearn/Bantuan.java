package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bantuan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(Bantuan.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}