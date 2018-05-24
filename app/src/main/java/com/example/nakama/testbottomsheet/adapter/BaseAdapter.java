package com.example.nakama.testbottomsheet.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nakama.testbottomsheet.model.BaseModel;
import com.example.nakama.testbottomsheet.viewholders.BaseViewHolder;

import java.util.ArrayList;

/**
 * Created by Hendri on 24/05/18.
 */
public abstract class BaseAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    ArrayList<BaseModel> data;
    private BottomSheetViewHolderFactory factory;

    public BaseAdapter(ArrayList<BaseModel> data) {
        this.data = data;
        this.factory = new BottomSheetViewHolderFactoryImpl();
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(viewType, parent, false);
        return factory.createViewHolder(view,viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getType();
    }

    @Override
    public void onViewRecycled(@NonNull BaseViewHolder holder) {
        holder.onViewRecycled();
        super.onViewRecycled(holder);
    }
}
