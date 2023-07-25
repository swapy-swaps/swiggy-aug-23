package org.example;

public class Location
{
    private String restroID;
    private int lat;
    private int log;
    public void setLat(int lat) {
        this.lat = lat;
    }

    public void setLog(int log) {
        this.log = log;
    }
    public void setRestroID(String restroID) {
        this.restroID = restroID;
    }
    public int getLat() {
        return lat;
    }
    public int getLog() {
        return log;
    }
    public String getRestroID() {
        return restroID;
    }
}
