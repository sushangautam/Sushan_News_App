package com.example.sushannewsapp;

public class Newspaper {
    private String mTitle;
    private String mCategory;
    private String mDate;
    private String mUrl;
    private String mAuthor;

    public Newspaper(String Title, String Category, String Date, String Url, String Author) {
        mTitle = Title;
        mCategory = Category;
        mDate = Date;
        mAuthor = Author;
        mUrl = Url;

    }
    public String getmTitle() {
        return mTitle;
    }

    public String getmCategory() {
        return mCategory;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmAuthor() {
        return mAuthor;
    }

}
