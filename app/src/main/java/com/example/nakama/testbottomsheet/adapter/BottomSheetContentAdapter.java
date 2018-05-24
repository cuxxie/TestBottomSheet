package com.example.nakama.testbottomsheet.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.nakama.testbottomsheet.model.BaseModel;
import com.example.nakama.testbottomsheet.viewholders.BaseViewHolder;

import java.util.ArrayList;

/**
 * Created by Hendri on 24/05/18.
 */
public class BottomSheetContentAdapter extends BaseAdapter {
    public BottomSheetContentAdapter(ArrayList<BaseModel> data) {
        super(data);
    }
}
