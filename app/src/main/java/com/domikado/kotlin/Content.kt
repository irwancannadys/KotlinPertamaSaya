package com.domikado.kotlin

// Created by irwancannady (irwancannady@gmail.com) on 2/6/17 at 2:41 PM.

import com.domikado.kotlin.model.DataModel
import java.util.*

object Content {

    val ITEMS: MutableList<DataModel> = ArrayList()

    private val COUNT = 25

    init {

        for (i in 1..COUNT) {
            ITEMS.add(createDummyItem(i))
        }
    }

    private fun createDummyItem(position: Int): DataModel {
        return DataModel(position.toString(), "Item " + position, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }
}
