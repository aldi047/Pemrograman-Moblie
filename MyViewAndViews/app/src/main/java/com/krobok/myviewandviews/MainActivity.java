package com.krobok.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button BtnDonasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle("Donasi Pesawat R80");
        }
        BtnDonasi = findViewById(R.id.btn_donasi);
        BtnDonasi.setOnClickListener(this);
    }

    @Override
    public void onClick(View pindah) {
        switch (pindah.getId()){
            case R.id.btn_donasi:
                Intent donasi = new Intent(MainActivity.this,DonasiActivity.class);
                startActivity(donasi);
                break;
        }
    }
}