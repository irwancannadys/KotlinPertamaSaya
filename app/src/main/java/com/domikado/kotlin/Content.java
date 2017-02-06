package com.domikado.kotlin;
// Created by irwancannady (irwancannady@gmail.com) on 2/6/17 at 2:41 PM.

import com.domikado.kotlin.model.DataModel;

import java.util.ArrayList;
import java.util.List;

public class Content {

    public static final List<DataModel> ITEMS = new ArrayList<>();

    private static final int COUNT = 25;

    static {

        for (int i = 1; i <= COUNT; i++) {
            ITEMS.add(createDummyItem(i));
        }
    }

    private static DataModel createDummyItem(int position) {
        return new DataModel(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
}
