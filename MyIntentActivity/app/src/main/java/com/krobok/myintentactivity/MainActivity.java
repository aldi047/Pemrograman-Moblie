package com.krobok.myintentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnMoveActivity;
    Button btnMoveActivityWithData;
    Button btnDial;
    Button btnBrw;
    Button btnHalSatu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity=findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData = findViewById(R.id.btn_move_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btnDial=findViewById(R.id.Btn_dial);
        btnDial.setOnClickListener(this);

        btnBrw=findViewById(R.id.brw_polines);
        btnBrw.setOnClickListener(this);

        btnHalSatu=findViewById(R.id.ex_intent);
        btnHalSatu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_data:
                Intent moveData = new Intent(MainActivity.this, MoveActivityWithData.class);
                moveData.putExtra(MoveActivityWithData.EXTRA_NAME, "Aldi");
                moveData.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
                startActivity(moveData);
                break;
            case R.id.Btn_dial:
                String phoneNumber = "085201533127";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.brw_polines:
                String url="http://polines.ac.id";
                Intent browsePolines = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browsePolines);
                break;
            case R.id.ex_intent:
                Intent pindahSatu = new Intent(MainActivity.this, HalamanActivitySatu.class);
                startActivity(pindahSatu);
                break;
        }
    }
}