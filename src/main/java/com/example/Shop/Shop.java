package com.example.Shop;

public class Shop {

    private String id;
    private String city;
    private String street;
    private String nameShop;
    private String workers;
    private boolean website;


    public String getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public String getWorkers() {
        return workers;
    }

    public void setWorkers(String workers) {
        this.workers = workers;
    }

    public boolean isWebsite() {
        return website;
    }

    public void setWebsite(boolean website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id='" + id + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", nameShop='" + nameShop + '\'' +
                ", workers='" + workers + '\'' +
                ", website=" + website +
                '}';
    }

    public Shop(String id, String city, String street, String nameShop, String workers, boolean website) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.nameShop = nameShop;
        this.workers = workers;
        this.website = website;

    }
}