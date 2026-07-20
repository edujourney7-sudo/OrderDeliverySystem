package com.lld.orderdeliverysystem.entities;

public class Location {

    private int pincode;
    private String longitude;
    private String latitide;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitide() {
        return latitide;
    }

    public void setLatitide(String latitide) {
        this.latitide = latitide;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
