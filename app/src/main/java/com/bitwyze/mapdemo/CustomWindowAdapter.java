package com.bitwyze.mapdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by srichard on 3/2/16.
 */
public class CustomWindowAdapter implements GoogleMap.InfoWindowAdapter {
    LayoutInflater mInflater;

    public CustomWindowAdapter(LayoutInflater i){
        mInflater = i;
    }


    @Override
    public View getInfoWindow(Marker marker) {
        // Getting view from the layout file
        View v = mInflater.inflate(R.layout.custom_info_window, null);
        // Populate fields
        TextView title = (TextView) v.findViewById(R.id.tv_info_window_title);
        title.setText(marker.getTitle());

        TextView description = (TextView) v.findViewById(R.id.tv_info_window_description);
        description.setText(marker.getSnippet());
        // Return info window contents
        return v;

    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
