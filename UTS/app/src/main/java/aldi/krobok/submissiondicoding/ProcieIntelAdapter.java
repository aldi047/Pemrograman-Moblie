package aldi.krobok.submissiondicoding;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ProcieIntelAdapter extends RecyclerView.Adapter<ProcieIntelAdapter.ListViewHolder> {
    private ArrayList<Procie> listSepeda;
    private Context context;

    public ProcieIntelAdapter(Context context, ArrayList<Procie> listSepeda){
        this.listSepeda = listSepeda;
        this.context = context;
    }
    @NonNull
    @Override
    public ProcieIntelAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_procie, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProcieIntelAdapter.ListViewHolder holder, int position) {
        final Procie sepeda = listSepeda.get(position);
        Glide.with(holder.itemView.getContext())
                .load(sepeda.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);
        holder.tvName.setText(sepeda.getName());
        holder.tvDesc.setText(sepeda.getDetail());
        holder.btnSumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sumber = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ark.intel.com"));
                context.startActivity(sumber);
            }
        });
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detail = new Intent(context, KetProcie.class);
                detail.putExtra("procie_id", sepeda.getId());
                context.startActivity(detail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSepeda.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;
        Button btnSumber;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDesc = itemView.findViewById(R.id.tv_item_detail);
            btnSumber = itemView.findViewById(R.id.btn_sumber);
            cv = itemView.findViewById(R.id.card_view);
        }
    }
}

//
//btnSumber = itemView.findViewById(R.id.btn_sumber);