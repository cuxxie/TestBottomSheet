package com.example.nakama.testbottomsheet.adapter;

import android.view.View;

import com.example.nakama.testbottomsheet.model.ButtonViewHolderModel;
import com.example.nakama.testbottomsheet.model.ImageViewHolderModel;
import com.example.nakama.testbottomsheet.model.TextViewHolderModel;
import com.example.nakama.testbottomsheet.viewholders.BaseViewHolder;

/**
 * Created by Hendri on 24/05/18.
 */
public interface BottomSheetViewHolderFactory {
    public BaseViewHolder createViewHolder(View view, int viewType);

    public int type(ButtonViewHolderModel model);
    public int type(ImageViewHolderModel model);
    public int type(TextViewHolderModel model);
}
