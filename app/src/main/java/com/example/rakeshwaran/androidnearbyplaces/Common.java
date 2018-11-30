package com.example.rakeshwaran.androidnearbyplaces;

import com.example.rakeshwaran.androidnearbyplaces.Model.MyPlaces;

import com.example.rakeshwaran.androidnearbyplaces.Model.Results;
import com.example.rakeshwaran.androidnearbyplaces.Remote.IGoogleAPIService;
import com.example.rakeshwaran.androidnearbyplaces.Remote.RetrofitClient;
import com.example.rakeshwaran.androidnearbyplaces.Remote.RetrofitScalarsClient;

public class Common {


    public static Results currentResult;
    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";

    public static IGoogleAPIService getGoogleAPIService()
    {
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }

    public static IGoogleAPIService getGoogleAPIServiceScalars()
    {
        return RetrofitScalarsClient.getScalarClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
