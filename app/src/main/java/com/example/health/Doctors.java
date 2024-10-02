package com.example.health;
import java.util.ArrayList;
public class Doctors {
    private String Name;
    private String Specialization;
    private ArrayList<String> time;
    private ArrayList<String>Dates;

    public String getName() {
        return Name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public ArrayList<String> getTime() {
        return time;
    }

    public ArrayList<String> getDates() {
        return Dates;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public void setTime(ArrayList<String> time) {
        this.time = time;
    }

    public void setDates(ArrayList<String> dates) {
        Dates = dates;
    }

    public Doctors() {
    }

    public Doctors(String name, String specialization, ArrayList<String> time, ArrayList<String> dates) {
        Name = name;
        Specialization = specialization;
        this.time = time;
        Dates = dates;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "Name='" + Name + '\'' +
                ", Specialization='" + Specialization + '\'' +
                ", time=" + time +
                ", Dates=" + Dates +
                '}';
    }
}
