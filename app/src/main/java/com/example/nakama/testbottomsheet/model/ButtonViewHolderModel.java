package com.example.nakama.testbottomsheet.model;

import com.example.nakama.testbottomsheet.viewholders.ButtonViewHolder;

/**
 * Created by Hendri on 24/05/18.
 */
public class ButtonViewHolderModel extends BaseModel {

    String text;
    String buttonTitle;


    public ButtonViewHolderModel(String text, String buttonTitle) {
        this.text = text;
        this.buttonTitle = buttonTitle;
    }

    @Override
    public int getType() {
        return ButtonViewHolder.LAYOUT;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getButtonTitle() {
        return buttonTitle;
    }

    public void setButtonTitle(String buttonTitle) {
        this.buttonTitle = buttonTitle;
    }
}
