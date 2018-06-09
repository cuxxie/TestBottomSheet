package com.example.nakama.testbottomsheet.adapter

import android.view.View
import com.example.nakama.testbottomsheet.model.BaseModel

import com.example.nakama.testbottomsheet.model.ButtonViewHolderModel
import com.example.nakama.testbottomsheet.model.ImageViewHolderModel
import com.example.nakama.testbottomsheet.model.TextViewHolderModel
import com.example.nakama.testbottomsheet.viewholders.BaseViewHolder
import com.example.nakama.testbottomsheet.viewholders.ButtonViewHolder
import com.example.nakama.testbottomsheet.viewholders.ImageViewHolder
import com.example.nakama.testbottomsheet.viewholders.TextViewHolder

/**
 * Created by Hendri on 24/05/18.
 */
class BottomSheetViewHolderFactoryImpl : BottomSheetViewHolderFactory {
    override fun createViewHolder(view: View, viewType: Int): BaseViewHolder<BaseModel> {
        var baseViewHolder: BaseViewHolder<BaseModel>? = null
        when (viewType) {
            ButtonViewHolder.LAYOUT -> baseViewHolder = ButtonViewHolder(view) as BaseViewHolder<BaseModel>
            TextViewHolder.LAYOUT -> baseViewHolder = TextViewHolder(view) as BaseViewHolder<BaseModel>
            ImageViewHolder.LAYOUT -> baseViewHolder = ImageViewHolder(view) as BaseViewHolder<BaseModel>
            else -> {
                baseViewHolder = ImageViewHolder(view) as BaseViewHolder<BaseModel>
            }
        }
        return baseViewHolder
    }

    override fun type(model: ButtonViewHolderModel): Int {
        return model.type
    }

    override fun type(model: ImageViewHolderModel): Int {
        return model.type
    }

    override fun type(model: TextViewHolderModel): Int {
        return model.type
    }
}
