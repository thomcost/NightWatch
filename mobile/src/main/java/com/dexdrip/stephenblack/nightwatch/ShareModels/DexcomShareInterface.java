package com.dexdrip.stephenblack.nightwatch.ShareModels;

import com.dexdrip.stephenblack.nightwatch.PebbleEndpoint;

import java.util.HashMap;
import java.util.Map;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.FieldMap;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;

/**
 * Created by stephenblack on 3/16/15.
 */
public interface DexcomShareInterface {
    @POST("/Publisher/ReadPublisherLatestGlucoseValues")
    ShareGlucose[] getShareBg(@QueryMap Map<String, String> options);

    @POST("/General/LoginPublisherAccountByName")
    void getSessionId(@Body ShareAuthenticationBody body, Callback<Response> callback);
    //Since this seems to respond with a string we need a callback that will parse the response body
    //new String(((TypedByteArray) response.getBody()).getBytes());
}
