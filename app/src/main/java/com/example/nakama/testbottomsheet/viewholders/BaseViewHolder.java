package com.example.nakama.testbottomsheet.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.nakama.testbottomsheet.model.BaseModel;

/**
 * Created by Hendri on 24/05/18.
 */
public abstract class BaseViewHolder<T extends BaseModel> extends RecyclerView.ViewHolder  {
    public BaseViewHolder(View itemView) {
        super(itemView);
    }
    public abstract void bind(T element);
    public abstract void onViewRecycled();
}
