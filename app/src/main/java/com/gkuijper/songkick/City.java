package com.gkuijper.songkick;

/**
 * Created by Gabrielle on 06-08-17.
 */

public class City {
    private String name;
    private String country;
    private int id;


    public City(String name, String country, int id) {
        this.name = name;
        this.country = country;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", id=" + id +
                '}';
    }
}
