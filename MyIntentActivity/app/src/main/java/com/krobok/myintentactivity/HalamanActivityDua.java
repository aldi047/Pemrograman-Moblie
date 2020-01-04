package com.krobok.myintentactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HalamanActivityDua extends AppCompatActivity {
    TextView tampil;
    public static final String ISI_TEKS="isi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_dua);
        tampil=findViewById(R.id.tampil_teks);
        String salinan =getIntent().getStringExtra(ISI_TEKS);
        tampil.setText(salinan);
    }
}
