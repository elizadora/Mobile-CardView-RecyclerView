package com.example.cardviewatv;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<CardView> newList;

    public Adapter(List<CardView> newList){
        this.newList = newList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView news = newList.get(position);
        holder.tv_title.setText(news.getTitle());
        holder.tv_description.setText(news.getDescription());
        holder.iv_logo.setImageResource(news.getLogoImage());
        holder.card_layout.setBackgroundResource(news.getBackgroundImage());
    }

    @Override
    public int getItemCount() {
        return newList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tv_title, tv_description;
        ImageView iv_logo;
        ConstraintLayout card_layout;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_description = itemView.findViewById(R.id.tv_description);
            iv_logo = itemView.findViewById(R.id.iv_logo);
            card_layout = itemView.findViewById(R.id.card_layout);

            tv_title.setOnClickListener(this);
            tv_description.setOnClickListener(this);
            iv_logo.setOnClickListener(this);
            card_layout.setOnClickListener(this);
        }

        @Override
        public void onClick(View v){
            Toast.makeText(v.getContext(), "Clicou em " + tv_title.getText(), Toast.LENGTH_SHORT).show();
        }
   }
}
