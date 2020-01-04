package aldi.krobok.submissiondicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvProcie;
    private ArrayList<Procie> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProcie = findViewById(R.id.rv_procie);
        rvProcie.setHasFixedSize(true);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Processor Intel");
        }

        list.addAll(ProcieDetail.getListData());
        showRecyclerList();
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.tentang:
                Intent profil = new Intent(this, Tentang.class);
                startActivity(profil);
                return true;
            default:
                return true;
        }
    }

    private void showRecyclerList(){
        rvProcie.setLayoutManager(new LinearLayoutManager(this));
        ProcieIntelAdapter procieIntelAdapter = new ProcieIntelAdapter(this,list);
        rvProcie.setAdapter(procieIntelAdapter);}}

