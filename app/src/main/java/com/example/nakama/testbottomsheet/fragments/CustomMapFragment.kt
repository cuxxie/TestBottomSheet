package com.example.nakama.testbottomsheet.fragments

import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.nakama.testbottomsheet.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback

/**
 * Created by Hendri on 24/05/18.
 */
class CustomMapFragment : BaseMapFragment(), OnMapReadyCallback, ActivityCompat.OnRequestPermissionsResultCallback {
    lateinit var googleMap: GoogleMap
    override fun onCreateView(layoutInflater: LayoutInflater, viewGroup: ViewGroup?, bundle: Bundle?): View? {
        val view = layoutInflater.inflate(R.layout.layout_map_fragment, viewGroup)
        baseCreateView(view, bundle, this)
        return view
    }

    override fun onMapReady(googleMap: GoogleMap) {
        this.googleMap = googleMap
        googleMap.moveCamera(CameraUpdateFactory.zoomIn())
    }
}
