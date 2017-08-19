package com.gkuijper.songkick;

/**
 * Created by Gabrielle on 06-08-17.
 */

public class Performance {
    private String name;
    private String billing;

    public Performance(String name, String billing) {
        this.name = name;
        this.billing = billing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBilling() {
        return billing;
    }

    public void setBilling(String billing) {
        this.billing = billing;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "name='" + name + '\'' +
                ", billing='" + billing + '\'' +
                '}';
    }
}
