package Adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gymkhana.R;

import java.util.ArrayList;

import Domain.CategoryDomain;

public class CatergoryAdaptor extends RecyclerView.Adapter<CatergoryAdaptor.ViewHolder> {
    ArrayList<CategoryDomain>CategoryDomains;

    public CatergoryAdaptor(ArrayList<CategoryDomain> CategoryDomains) {
        this.CategoryDomains = CategoryDomains;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.categoryName.setText(c);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView categoryName;
        ImageView categoryPic;
        ConstraintLayout mainLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName=itemView.findViewById(R.id.Categorytext);
            categoryPic=itemView.findViewById(R.id.Categorypic);
            mainLayout=itemView.findViewById(R.id.mainLayout);
        }
    }
}
