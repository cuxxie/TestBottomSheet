package com.example.nakama.testbottomsheet.adapter

import android.view.View
import com.example.nakama.testbottomsheet.model.BaseModel

import com.example.nakama.testbottomsheet.model.ButtonViewHolderModel
import com.example.nakama.testbottomsheet.model.ImageViewHolderModel
import com.example.nakama.testbottomsheet.model.TextViewHolderModel
import com.example.nakama.testbottomsheet.viewholders.BaseViewHolder

/**
 * Created by Hendri on 24/05/18.
 */
interface BottomSheetViewHolderFactory {
    fun createViewHolder(view: View, viewType: Int): BaseViewHolder<BaseModel>

    fun type(model: ButtonViewHolderModel): Int
    fun type(model: ImageViewHolderModel): Int
    fun type(model: TextViewHolderModel): Int
}
