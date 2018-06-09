package com.example.nakama.testbottomsheet.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.nakama.testbottomsheet.model.BaseModel
import com.example.nakama.testbottomsheet.viewholders.BaseViewHolder

import java.util.ArrayList

/**
 * Created by Hendri on 24/05/18.
 */
abstract class BaseAdapter(internal var data: ArrayList<BaseModel>) : RecyclerView.Adapter<BaseViewHolder<BaseModel>>() {
    private val factory: BottomSheetViewHolderFactory

    init {
        this.factory = BottomSheetViewHolderFactoryImpl()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<BaseModel> {
        val context = parent.context
        val view = LayoutInflater.from(context).inflate(viewType, parent, false)
        return factory.createViewHolder(view, viewType)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<BaseModel>, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun getItemViewType(position: Int): Int {
        return data[position].type
    }

    override fun onViewRecycled(holder: BaseViewHolder<BaseModel>) {
        holder.onViewRecycled()
        super.onViewRecycled(holder)
    }
}
