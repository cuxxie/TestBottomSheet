package com.example.nakama.testbottomsheet.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nakama.testbottomsheet.R;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

/**
 * Created by Hendri on 24/05/18.
 */
public abstract class BaseMapFragment extends Fragment {
    protected MapView mapView;

    public void baseCreateView(View view, Bundle bundle, OnMapReadyCallback callback){
        mapView = view.findViewById(R.id.mapview);
        mapView.getMapAsync(callback);
        mapView.onCreate(bundle);
    }

    @Override
    public void onResume() {
        super.onResume();
        if(mapView != null)
            mapView.onResume();
    }

    @Override
    public void onStart() {
        super.onStart();
        if(mapView != null)
            mapView.onStart();
    }

    @Override
    public void onStop() {
        if(mapView != null)
            mapView.onStop();
        super.onStop();
    }

    @Override
    public void onPause() {
        if(mapView != null)
            mapView.onPause();
        super.onPause();
    }

    @Override
    public void onDestroy() {
        if(mapView != null)
            mapView.onDestroy();
        super.onDestroy();
    }
}
