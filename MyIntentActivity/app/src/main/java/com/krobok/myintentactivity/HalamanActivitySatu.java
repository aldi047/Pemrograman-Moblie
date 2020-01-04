package com.krobok.myintentactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HalamanActivitySatu extends AppCompatActivity implements View.OnClickListener {

    Button btnPindah;
    TextView isi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_satu);

        btnPindah = findViewById(R.id.pindah_hal);
        btnPindah.setOnClickListener(this);

        isi=findViewById(R.id.isi_teks);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.pindah_hal){
            Intent salinTeks = new Intent(HalamanActivitySatu.this, HalamanActivityDua.class);
            salinTeks.putExtra(HalamanActivityDua.ISI_TEKS, isi.getText().toString());
            startActivity(salinTeks);
        }
    }
}
