package com.example.nakama.testbottomsheet.viewholders;

import android.view.View;
import android.widget.TextView;

import com.example.nakama.testbottomsheet.R;
import com.example.nakama.testbottomsheet.model.TextViewHolderModel;

/**
 * Created by Hendri on 24/05/18.
 */
public class TextViewHolder extends BaseViewHolder<TextViewHolderModel> {
    public static final int LAYOUT = R.layout.vh_text;
    TextView text;
    public TextViewHolder(View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.text);
    }

    @Override
    public void bind(TextViewHolderModel element) {
        text.setText(element.getText());
    }

    @Override
    public void onViewRecycled() {

    }
}
