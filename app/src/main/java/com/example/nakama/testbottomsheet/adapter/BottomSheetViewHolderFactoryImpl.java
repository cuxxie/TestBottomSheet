package com.example.nakama.testbottomsheet.adapter;

import android.view.View;

import com.example.nakama.testbottomsheet.model.ButtonViewHolderModel;
import com.example.nakama.testbottomsheet.model.ImageViewHolderModel;
import com.example.nakama.testbottomsheet.model.TextViewHolderModel;
import com.example.nakama.testbottomsheet.viewholders.BaseViewHolder;
import com.example.nakama.testbottomsheet.viewholders.ButtonViewHolder;
import com.example.nakama.testbottomsheet.viewholders.ImageViewHolder;
import com.example.nakama.testbottomsheet.viewholders.TextViewHolder;

/**
 * Created by Hendri on 24/05/18.
 */
public class BottomSheetViewHolderFactoryImpl implements BottomSheetViewHolderFactory {
    @Override
    public BaseViewHolder createViewHolder(View view, int viewType) {
        BaseViewHolder baseViewHolder = null;
        switch (viewType){
            case ButtonViewHolder.LAYOUT:
                baseViewHolder = new ButtonViewHolder(view);
                break;
            case TextViewHolder.LAYOUT:
                baseViewHolder = new TextViewHolder(view);
                break;
            case ImageViewHolder.LAYOUT:
                baseViewHolder = new ImageViewHolder(view);
                break;
            default:break;
        }
        return baseViewHolder;
    }

    @Override
    public int type(ButtonViewHolderModel model) {
        return model.getType();
    }

    @Override
    public int type(ImageViewHolderModel model) {
        return model.getType();
    }

    @Override
    public int type(TextViewHolderModel model) {
        return model.getType();
    }
}
