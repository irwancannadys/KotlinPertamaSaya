package com.domikado.kotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.domikado.kotlin.R
import com.domikado.kotlin.model.DataModel

// Created by irwancannady (irwancannady@gmail.com) on 2/6/17 at 2:12 PM.


class Adapter(private val mValues: List<DataModel>, private val mListener: Function1<DataModel, Unit>?) :
        RecyclerView.Adapter<Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount()=
        mValues.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hero = mValues[position]
        holder.item = hero
        holder.idView.text = hero.id
        holder.contentView.text = hero.content

        holder.itemView.setOnClickListener {
            mListener?.invoke(hero)
        }
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){

        val idView: TextView
        val contentView: TextView
        var item: DataModel? = null

        init {
            idView = view.findViewById(R.id.id) as TextView
            contentView = view.findViewById(R.id.content) as TextView
        }

    }

}