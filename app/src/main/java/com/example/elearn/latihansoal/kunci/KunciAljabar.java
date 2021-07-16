package com.example.elearn.latihansoal.kunci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.elearn.MainActivity;
import com.example.elearn.R;

public class KunciAljabar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kunci_aljabar);
    }

    public void GoToMenuUtama(View view) {
        Intent IntMenuUtama = new Intent(KunciAljabar.this, MainActivity.class);
        startActivity(IntMenuUtama);
    }
}