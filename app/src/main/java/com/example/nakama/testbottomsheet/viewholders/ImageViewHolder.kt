package com.example.nakama.testbottomsheet.viewholders

import android.view.View
import android.widget.ImageView

import com.bumptech.glide.Glide
import com.example.nakama.testbottomsheet.R
import com.example.nakama.testbottomsheet.model.ImageViewHolderModel
import com.example.nakama.testbottomsheet.module.GlideApp

/**
 * Created by Hendri on 24/05/18.
 */
class ImageViewHolder(internal var view: View) : BaseViewHolder<ImageViewHolderModel>(view) {
    internal var image: ImageView

    init {
        image = view.findViewById(R.id.image)
    }

    override fun bind(element: ImageViewHolderModel) {
        GlideApp.with(view).load(element.imageUrl)
                .fitCenter().into(image)
    }

    override fun onViewRecycled() {
        GlideApp.with(view).clear(image)
    }

    companion object {
        val LAYOUT = R.layout.vh_image
    }
}
