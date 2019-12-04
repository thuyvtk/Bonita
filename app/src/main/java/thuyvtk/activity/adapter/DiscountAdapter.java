package thuyvtk.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import thuyvtk.activity.R;

public class DiscountAdapter extends RecyclerView.Adapter<DiscountAdapter.MyViewHolder> {

    Context context;
    private String[] types = {
            "Mới nhất",
            "Gần tôi",
            "Xem nhiều",
            "Giảm sâu nhất",
            "Sắp hết hạn"
    };

    public DiscountAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.discount_layout, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.type_filter.setText(types[position]);
    }

    @Override
    public int getItemCount() {
        return types.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView type_filter;

        public MyViewHolder(View itemView) {
            super(itemView);
            type_filter = itemView.findViewById(R.id.type_filter);
        }

    }
}
