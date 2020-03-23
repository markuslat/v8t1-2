package com.example.v8t2;

public class Bottle {

    private String name;
    private String manufacturer;
    private double total_energy;
    private double size;
    private double price;


    public Bottle(String n, double s, double p) {
        name = n;
        size = s;
        price = p;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public double getSize(){
        return size;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public double getEnergy(){
        return total_energy;
    }
}


