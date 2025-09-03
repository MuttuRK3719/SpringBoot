package org.example.cabinvoice;

public class Costumer {
    private int customerId;
    private int totalMinutes;
    private int totalTravel;
    private  int ride;
    InvoiceService service;
    public int getRide() {
        return ride;
    }

    public InvoiceService getService() {
        return service;
    }

    public void setRide(int ride) {
        this.ride = ride;
    }

    public Costumer(int customerId, InvoiceService service) {
        this.customerId = customerId;
        this.service = service;
    }

    public Costumer(int customerId, int totalMinutes, int totalTravel) {
        this.customerId = customerId;
        this.totalMinutes = totalMinutes;
        this.totalTravel = totalTravel;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public void setTotalMinutes(int totalMinutes) {
        this.totalMinutes = totalMinutes;
    }

    public int getTotalTravel() {
        return totalTravel;
    }

    public void setTotalTravel(int totalTravel) {
        this.totalTravel = totalTravel;
    }
}
