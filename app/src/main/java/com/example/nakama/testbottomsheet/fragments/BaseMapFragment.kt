package com.example.nakama.testbottomsheet.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.nakama.testbottomsheet.R
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback

/**
 * Created by Hendri on 24/05/18.
 */
abstract class BaseMapFragment : Fragment() {
    protected var mapView: MapView? = null

    fun baseCreateView(view: View, bundle: Bundle?, callback: OnMapReadyCallback) {
        mapView = view.findViewById(R.id.mapview)
        mapView!!.getMapAsync(callback)
        mapView!!.onCreate(bundle)
    }

    override fun onResume() {
        super.onResume()
        if (mapView != null)
            mapView!!.onResume()
    }

    override fun onStart() {
        super.onStart()
        if (mapView != null)
            mapView!!.onStart()
    }

    override fun onStop() {
        if (mapView != null)
            mapView!!.onStop()
        super.onStop()
    }

    override fun onPause() {
        if (mapView != null)
            mapView!!.onPause()
        super.onPause()
    }

    override fun onDestroy() {
        if (mapView != null)
            mapView!!.onDestroy()
        super.onDestroy()
    }
}
