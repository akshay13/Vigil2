package com.qbi.vigil;

/**
 * Created by Akshay on 11/23/2016.
 */
public class DangerZone {

    private double centerLatitude;
    private double centerLongitude;
    private double radius;
    private double severity;

    public double getCenterLatitude() {
        return centerLatitude;
    }

    public void setCenterLatitude(double centerLatitude) {
        this.centerLatitude = centerLatitude;
    }

    public double getCenterLongitude() {
        return centerLongitude;
    }

    public void setCenterLongitude(double centerLongitude) {
        this.centerLongitude = centerLongitude;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSeverity() {
        return severity;
    }

    public void setSeverity(double severity) {
        this.severity = severity;
    }

    public DangerZone(double severity, double radius, double centerLatitude, double centerLongitude) {

        this.severity = severity;
        this.radius = radius;
        this.centerLongitude = centerLongitude;
        this.centerLatitude = centerLatitude;
    }
}
