package com.example.sushannewsapp;

import android.content.Context;
import android.widget.ListView;

import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

public class NewsLoad extends AsyncTaskLoader<List<Newspaper>> {

    private static String REQUEST_URL =
            "http://content.guardianapis.com/search?show-tags=contributor&api-key=test";

    public NewsLoad(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Newspaper> loadInBackground() {
        if (REQUEST_URL == null) {
            return null;
        }

        List<Newspaper> newsList = QueryUtils.fetchNewsData(REQUEST_URL);
        return newsList;
    }
}
