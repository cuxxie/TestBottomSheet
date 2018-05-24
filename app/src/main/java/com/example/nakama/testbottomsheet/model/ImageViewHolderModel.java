package com.example.nakama.testbottomsheet.model;

import com.example.nakama.testbottomsheet.viewholders.ImageViewHolder;

/**
 * Created by Hendri on 24/05/18.
 */
public class ImageViewHolderModel extends BaseModel {

    String imageUrl;

    public ImageViewHolderModel(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int getType() {
        return ImageViewHolder.LAYOUT;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
