package com.example.health;

import java.util.ArrayList;

public class Pharmacy {
    private String name ;
    private String time;
    private ArrayList<String> pharmacy;
    private String Address;
    private String Phone;

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public ArrayList<String> getPharmacy() {
        return pharmacy;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPharmacy(ArrayList<String> pharmacy) {
        this.pharmacy = pharmacy;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setAddress(String address) {
        Address = address;
    }
    public Pharmacy(String name, String time, ArrayList<String> pharmacy, String address, String phone) {
        this.name = name;
        this.time = time;
        this.pharmacy = pharmacy;
        Address = address;
    }
    public Pharmacy() {
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", pharmacy=" + pharmacy +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
