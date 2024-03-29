package com.example.recomap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.recomap.databinding.ActivityMapEditActicityBinding;

public class MapEditActicity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapEditActicityBinding binding;

    private LatLng currLating = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapEditActicityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.editmap);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
mapInit();
        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
    private void mapInit() {
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

        CameraPosition.Builder builder = new CameraPosition.Builder();
//
        builder.target((new LatLng(35.681382,139.766084)));
        builder.zoom(15.5f);

        CameraPosition cameraPosition = builder.build();


        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        UiSettings ui = mMap.getUiSettings();
        ui.setCompassEnabled(false);
        ui.setRotateGesturesEnabled(false);
        ui.setRotateGesturesEnabled(false);
        ui.setTiltGesturesEnabled(false);
        ui.setZoomControlsEnabled(true);
        ui.setZoomGesturesEnabled(true);

        MarkerOptions op = new MarkerOptions();




    }
}