package com.bignerdranch.android.splash;

/**
 * Created by user on 8/10/16.
 */


public class NewsItem {
    private String headline;
    private String reporterName;
    private String date;
    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}