package com.test.aitpteam.aitppractice1;
import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static android.app.PendingIntent.getActivity;


/**
 * Created by gnoej on 3/31/2016.
 */
public class apiManager extends AsyncTask</*Input*/String, /*Track Progress how?*/Void,/*Result/Return type*/String > {
    protected String doInBackground(String... urlIn) {
        URL url = null;
        try {
            url = new URL(urlIn[0]);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection urlConnection = null;
        try {
            urlConnection = (HttpURLConnection) url.openConnection();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            urlConnection.disconnect();
        }
    }
}
