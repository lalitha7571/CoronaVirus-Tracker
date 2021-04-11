package com.coronavirus.coronavirustracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int LatestReports;

    public int getDiffFromPreviousDay() {
        return diffFromPreviousDay;
    }

    public void setDiffFromPreviousDay(int diffFromPreviousDay) {
        this.diffFromPreviousDay = diffFromPreviousDay;
    }

    private int diffFromPreviousDay;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestReports() {
        return LatestReports;
    }

    public void setLatestReports(int latestReports) {
        LatestReports = latestReports;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", LatestReports=" + LatestReports +
                '}';
    }
}
