package com.comw.grocerieslist.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.comw.grocerieslist.Category;
import com.comw.grocerieslist.R;

import java.util.List;

public class CategoryViewAdapter extends RecyclerView.Adapter<CategoryViewAdapter.ExampleViewHolder> {
    private List<Category> mExampleItems;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView itemName;
        public TextView itemDescription;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            itemName = itemView.findViewById(R.id.textView);
            itemDescription = itemView.findViewById(R.id.descriptionTextView);
        }

    }

    public CategoryViewAdapter(List<Category> exampleItems) {
        mExampleItems = exampleItems;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.example_item, viewGroup, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {
        Category currentItem = mExampleItems.get(i);
//        exampleViewHolder.imageView.setImageResource(currentItem.getImage());
        exampleViewHolder.itemName.setText(currentItem.getCategoryName());
//        exampleViewHolder.itemDescription.setText(currentItem.getCategoryDescription());
    }

    @Override
    public int getItemCount() {
        return mExampleItems.size();
    }
}
