package thuyvtk.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import thuyvtk.activity.R;

public class IconAdapters extends RecyclerView.Adapter<IconAdapters.MyViewHolder>{

    private Context context;
    private Integer[] listIcons = {
            R.drawable.ic_woman_with_long_hair,
            R.drawable.ic_men_service,
            R.drawable.ic_nail_polish,
            R.drawable.ic_spa,
            R.drawable.ic_makeup
    };

    private String[]  listName = {
      "Tóc nữ",
      "Tóc nam",
      "Nail",
      "Spa",
      "Trang điểm"
    };

    public IconAdapters(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.icon_layout, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageResource(listIcons[position]);
        holder.icon_name.setText(listName[position]);
    }

    @Override
    public int getItemCount() {
        return listIcons.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView icon_name;
        ImageButton image;

        public MyViewHolder(View itemView) {
            super(itemView);

            icon_name = itemView.findViewById(R.id.txtIconName);
            image = itemView.findViewById(R.id.ivIcon);
        }

    }
}
