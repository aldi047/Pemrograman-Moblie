package aldi.krobok.submissiondicoding;

import android.app.ActionBar;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class KetProcie extends AppCompatActivity {

    private int proc_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Procie> listProcie = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_procie);

        proc_id = getIntent().getIntExtra("procie_id", 0);
        tvName = findViewById(R.id.nama_procie);
        tvDesc = findViewById(R.id.detail);
        imgDetail = findViewById(R.id.img_detail);

        listProcie.addAll(ProcieDetail.getListData());

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(listProcie.get(proc_id).getName());
        }

        setLayout();

    }

    public  void setLayout(){
        tvName.setText(listProcie.get(proc_id).getName());
        tvDesc.setText(listProcie.get(proc_id).getDetail());
        Glide.with(this)
                .load(listProcie.get(proc_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}