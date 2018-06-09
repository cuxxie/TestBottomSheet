package com.example.nakama.testbottomsheet.model

import com.example.nakama.testbottomsheet.viewholders.ImageViewHolder

/**
 * Created by Hendri on 24/05/18.
 */
class ImageViewHolderModel(var imageUrl: String) : BaseModel() {

    override val type: Int
        get() = ImageViewHolder.LAYOUT
}
