/*
According to apache license

This is fork of christocracy cordova-plugin-background-geolocation plugin
https://github.com/christocracy/cordova-plugin-background-geolocation

This is a new class
*/

package com.marianhello.bgloc;

import android.content.Context;
import com.marianhello.bgloc.data.DAOFactory;
import com.marianhello.bgloc.LocationProvider;
// import com.tenforwardconsulting.bgloc.DistanceFilterLocationProvider;
import com.marianhello.bgloc.ActivityRecognitionLocationProvider;
import java.lang.IllegalArgumentException;

/**
 * LocationProviderFactory
 */
public class LocationProviderFactory {

    private LocationService context;

    public LocationProviderFactory(LocationService context) {
        this.context = context;
    };

    public LocationProvider getInstance (Integer locationProvider) {
        LocationProvider provider = new ActivityRecognitionLocationProvider(context);
        provider.onCreate();
        return provider;
    }
}
