package com.example.nakama.testbottomsheet.model

import com.example.nakama.testbottomsheet.viewholders.ButtonViewHolder

/**
 * Created by Hendri on 24/05/18.
 */
class ButtonViewHolderModel(var text: String, var buttonTitle: String) : BaseModel() {

    override val type: Int
        get() = ButtonViewHolder.LAYOUT
}
