package thuyvtk.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
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
//            R.drawable.brand1,
//            R.drawable.thirtyshine,
//            R.drawable.loli,
//            R.drawable.gift_salon,
//            R.drawable.farther,
//            R.drawable.men_baber,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
    };

    private String[] names = {
            "Chang Nails",
            "30 Shine",
            "Loli Nails",
            "Gift Salon",
            "Farther's Day Cut",
            "Men Baber",
    };

    private String[] rate = {
            "4.5 ",
            "4.1 ",
            "4.8 ",
            "4.5 ",
            "4.7 ",
            "4.5 ",
    };

    public BrandAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.brand_layout, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.ivBrand.setImageResource(images[position]);
        holder.txtBrandName.setText(names[position]);
        holder.txtRate.setText(rate[position]);
        holder.ivBrandNext.setImageResource(images[position + 3]);
        holder.txtBrandNameNext.setText(names[position + 3]);
        holder.txtRateNext.setText(rate[position + 3]);

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivBrand;
        TextView txtBrandName;
        TextView txtRate;
        ImageView ivBrandNext;
        TextView txtBrandNameNext;
        TextView txtRateNext;


        public MyViewHolder(View itemView) {
            super(itemView);

            ivBrand = itemView.findViewById(R.id.ivBrand);
            txtBrandName = itemView.findViewById(R.id.txtBrandName);
            txtRate = itemView.findViewById(R.id.txtRate);
            ivBrandNext = itemView.findViewById(R.id.ivBrandNext);
            txtBrandNameNext = itemView.findViewById(R.id.txtBrandNameNext);
            txtRateNext = itemView.findViewById(R.id.txtRateNext);

        }

    }

}
