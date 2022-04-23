package com.google.maps.android.utils.demo.model;

import android.content.Context;
import android.graphics.Color;

import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
//This class allows us to change cluster colors
public class CustomClusterRenderer extends DefaultClusterRenderer<MyItem> {

    public CustomClusterRenderer(Context context, GoogleMap map, ClusterManager<MyItem> clusterManager) {
        super(context, map, clusterManager);
    }

    @Override
    protected int getColor(int clusterSize) {
        return Color.RED;
    }
}