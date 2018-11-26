package com.manisterstudio.recyclerviewapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgammingAdapter extends RecyclerView.Adapter<ProgammingAdapter.ProgrammingViewHolder> {

    private String[] data;
   public ProgammingAdapter(String[] data){
       this.data = data;
   }
    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent,false);
         return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {

       String title = data[position];
       holder.textTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
       ImageView img;
       TextView textTitle;
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            img       = itemView.findViewById(R.id.img);
            textTitle = itemView.findViewById(R.id.textTitle);


        }
    }

}
