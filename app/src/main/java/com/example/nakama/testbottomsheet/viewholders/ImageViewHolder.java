package com.example.nakama.testbottomsheet.viewholders;

import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.nakama.testbottomsheet.R;
import com.example.nakama.testbottomsheet.model.ImageViewHolderModel;
import com.example.nakama.testbottomsheet.module.GlideApp;

/**
 * Created by Hendri on 24/05/18.
 */
public class ImageViewHolder extends BaseViewHolder<ImageViewHolderModel> {
    public static final int LAYOUT = R.layout.vh_image;
    View view;
    ImageView image;
    public ImageViewHolder(View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
        view = itemView;
    }

    @Override
    public void bind(ImageViewHolderModel element) {
        GlideApp.with(view).load(element.getImageUrl())
                .fitCenter().into(image);
    }

    @Override
    public void onViewRecycled() {
        GlideApp.with(view).clear(image);
    }
}
