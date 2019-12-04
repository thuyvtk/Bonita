package thuyvtk.activity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import thuyvtk.activity.R;

public class BrandAdapter extends RecyclerView.Adapter<BrandAdapter.MyViewHolder> {

    private Context context;
    private Integer[] images = {
            R.drawable.brand1,
            R.drawable.ic_men_service,
            R.drawable.ic_nail_polish,
            R.drawable.ic_spa,
            R.drawable.ic_makeup
    };

    private String[] names = {
      "Chang Nails",
    };

    private String[] rate = {
            "4.5 ",
    };

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView ivBrand;
        TextView txtBrandName;
        TextView txtRate;

        public MyViewHolder(View itemView) {
            super(itemView);

            ivBrand = itemView.findViewById(R.id.ivBrand);
            txtBrandName = itemView.findViewById(R.id.txtBrandName);
            txtRate = itemView.findViewById(R.id.txtRate);
        }

    }

}
