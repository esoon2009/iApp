package com.example.user.iapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class NearestOptometrist extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest_optometrist);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
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
       LatLng kjOptometrist = new LatLng(1.322454,103.902630);
       Marker markerKJOptometrist = mMap.addMarker(new MarkerOptions().position(kjOptometrist).title("KJ Optometrist").snippet("This is KJ Optometrist"));
       mMap.moveCamera(CameraUpdateFactory.newLatLng(kjOptometrist));

        LatLng eyeChampOptometrists = new LatLng(1.377329,103.849121);
        Marker markerEyeChampOptometrists= mMap.addMarker(new MarkerOptions().position(eyeChampOptometrists).title("Eye Champ Optometrist").snippet("This is Eye Champ Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(eyeChampOptometrists));

        LatLng saVisionOptometrists = new LatLng(1.312389,103.792499);
        Marker markerSaVisionOptometrists= mMap.addMarker(new MarkerOptions().position(saVisionOptometrists).title("Sa Vision Optometrist").snippet("This is Sa Vision Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(saVisionOptometrists));

        LatLng eyeCarePeople = new LatLng(1.314669,103.793954);
        Marker markerEyeCarePeople = mMap.addMarker(new MarkerOptions().position(eyeCarePeople).title("Eyecare People").snippet("This is EyeCare People Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(eyeCarePeople));

        LatLng northernOpticians = new LatLng(1.321226,103.853474);
        Marker markerNorthernOpticians = mMap.addMarker(new MarkerOptions().position(northernOpticians).title("Northern Opticians").snippet("This is Northern Optician"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(northernOpticians));

        LatLng eyeChampOptometristsHeadquarters = new LatLng(1.387027,103.848071);
        Marker markerEyeChampOptometristsHeadquarters = mMap.addMarker(new MarkerOptions().position(eyeChampOptometristsHeadquarters).title("Eye Champ Optometrists Headquarters").snippet("This is Eye Champ Optometrist Headquarters"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(eyeChampOptometristsHeadquarters));

        LatLng unitedEyeCare = new LatLng(1.325093,103.843135);
        Marker markerUnitedEyeCare = mMap.addMarker(new MarkerOptions().position(unitedEyeCare).title("United EyeCare(Novena) LLP Optometrist").snippet("This is United Eyecare(Novena)LLP"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(unitedEyeCare));

        LatLng twentyTwentyVisionOptometrists = new LatLng(1.445125,103.785932);
        Marker markerTwentyTwentyVisionOptometrists= mMap.addMarker(new MarkerOptions().position(twentyTwentyVisionOptometrists).title("20/20 Vision Optometrists").snippet("This is 20/20 Vision Optometrists"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(twentyTwentyVisionOptometrists));

        LatLng twentyTwentyVisionOptometristsAtChoaChuKang = new LatLng(1.385646,103.745625);
        Marker markerTwentyTwentyVisionOptometristsAtChoaChuKang= mMap.addMarker(new MarkerOptions().position(twentyTwentyVisionOptometristsAtChoaChuKang).title("20/20 Vision Optometrists").snippet("This is 20/20 Vision Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(twentyTwentyVisionOptometristsAtChoaChuKang));

        LatLng optometristAtWork = new LatLng(1.292810,103.803437);
        Marker markerOptometristAtWork= mMap.addMarker(new MarkerOptions().position(optometristAtWork).title("Optometrist @ Work").snippet("This is Optometrist @ Work"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(optometristAtWork));

        LatLng northernOpticiansJurongPoint= new LatLng(1.345525,103.707494);
        Marker markerNorthernOpticiansJurongPoint= mMap.addMarker(new MarkerOptions().position(northernOpticiansJurongPoint).title("Northern Opticians").snippet("This is Northern Optician"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(northernOpticiansJurongPoint));




        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
