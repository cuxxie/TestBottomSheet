package com.example.nakama.testbottomsheet.viewholders

import android.app.AlertDialog
import android.app.Dialog
import android.view.View
import android.widget.Button
import android.widget.TextView

import com.example.nakama.testbottomsheet.R
import com.example.nakama.testbottomsheet.model.BaseModel
import com.example.nakama.testbottomsheet.model.ButtonViewHolderModel

/**
 * Created by Hendri on 24/05/18.
 */
class ButtonViewHolder(itemView: View) : BaseViewHolder<ButtonViewHolderModel>(itemView) {
    internal var button: Button
    internal var textView: TextView

    init {
        button = itemView.findViewById(R.id.button)
        textView = itemView.findViewById(R.id.text)
    }

    override fun bind(element: ButtonViewHolderModel) {
        button.text = element.buttonTitle
        button.setOnClickListener { val alertDialog = AlertDialog.Builder(itemView.context).setTitle(element.buttonTitle + " Action").setMessage(element.text).show() }
        textView.text = element.text
    }

    override fun onViewRecycled() {

    }

    companion object {
        val LAYOUT = R.layout.vh_button
    }
}
