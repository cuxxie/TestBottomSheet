package com.example.nakama.testbottomsheet.viewholders;

import android.app.AlertDialog;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.nakama.testbottomsheet.R;
import com.example.nakama.testbottomsheet.model.BaseModel;
import com.example.nakama.testbottomsheet.model.ButtonViewHolderModel;

/**
 * Created by Hendri on 24/05/18.
 */
public class ButtonViewHolder extends BaseViewHolder<ButtonViewHolderModel> {
    public static final int LAYOUT = R.layout.vh_button;
    Button button;
    TextView textView;
    public ButtonViewHolder(View itemView) {
        super(itemView);
        button = itemView.findViewById(R.id.button);
        textView = itemView.findViewById(R.id.text);
    }

    @Override
    public void bind(final ButtonViewHolderModel element) {
        button.setText(element.getButtonTitle());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.
                        Builder(itemView.getContext()).
                        setTitle(element.getButtonTitle() + " Action").
                        setMessage(element.getText()).show();
            }
        });
        textView.setText(element.getText());
    }

    @Override
    public void onViewRecycled() {

    }
}
