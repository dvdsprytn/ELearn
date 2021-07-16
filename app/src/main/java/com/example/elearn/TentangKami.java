package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TentangKami extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_kami);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(TentangKami.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}