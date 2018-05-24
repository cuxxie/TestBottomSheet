package com.example.nakama.testbottomsheet.model;

import com.example.nakama.testbottomsheet.viewholders.TextViewHolder;

/**
 * Created by Hendri on 24/05/18.
 */
public class TextViewHolderModel extends BaseModel {

    String text;

    public TextViewHolderModel(String text) {
        this.text = text;
    }

    @Override
    public int getType() {
        return TextViewHolder.LAYOUT;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
