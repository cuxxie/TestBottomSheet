package com.example.nakama.testbottomsheet.viewholders

import android.view.View
import android.widget.TextView

import com.example.nakama.testbottomsheet.R
import com.example.nakama.testbottomsheet.model.TextViewHolderModel

/**
 * Created by Hendri on 24/05/18.
 */
class TextViewHolder(itemView: View) : BaseViewHolder<TextViewHolderModel>(itemView) {
    internal var text: TextView

    init {
        text = itemView.findViewById(R.id.text)
    }

    override fun bind(element: TextViewHolderModel) {
        text.text = element.text
    }

    override fun onViewRecycled() {

    }

    companion object {
        val LAYOUT = R.layout.vh_text
    }
}
