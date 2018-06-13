package com.udacity.gradle.builditbigger;


import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;

class EndpointsAsyncTask extends AsyncTask <Context, Void, String> {
    private GetTheResult getTheResult;
    private static MyApi myApiService = null;

    @Override
    protected String doInBackground(Context... params) {
        if(myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("https://build-it-bigger-3.appspot.com/_ah/api/");

            // end options for devappserver

            myApiService = builder.build();
        }

        getTheResult = (GetTheResult) params[0];

        try {
            return myApiService.getFunnyJoke().execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        if (result != null && getTheResult != null){
            getTheResult.onGetResult(result);
        }

    }

    public interface GetTheResult{
        void onGetResult(String result);
    }
}

