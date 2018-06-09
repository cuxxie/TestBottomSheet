package com.example.nakama.testbottomsheet.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View

import com.example.nakama.testbottomsheet.model.BaseModel

/**
 * Created by Hendri on 24/05/18.
 */
abstract class BaseViewHolder<T : BaseModel>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(element: T)
    abstract fun onViewRecycled()
}
