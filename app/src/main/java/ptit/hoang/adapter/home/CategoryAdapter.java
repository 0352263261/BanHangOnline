package ptit.hoang.adapter.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import ptit.hoang.saleonline.R;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>{
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout root_item_category;
        private ImageView img_item_category;
        private TextView txt_item_category;

        public ViewHolder(View itemView) {
            super(itemView);
            root_item_category = itemView.findViewById(R.id.root_item_category);
            img_item_category = itemView.findViewById(R.id.img_item_category);
            txt_item_category = itemView.findViewById(R.id.txt_item_category);
        }
    }
}
