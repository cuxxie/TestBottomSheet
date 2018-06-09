package com.example.nakama.testbottomsheet.model

import com.example.nakama.testbottomsheet.viewholders.TextViewHolder

/**
 * Created by Hendri on 24/05/18.
 */
class TextViewHolderModel(var text: String) : BaseModel() {

    override val type: Int
        get() = TextViewHolder.LAYOUT
}
