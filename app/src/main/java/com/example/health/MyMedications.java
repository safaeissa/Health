package com.example.health;
import java.util.ArrayList;
public class MyMedications {
    private ArrayList<String> medications;
    private ArrayList<String> times;
    private ArrayList<String> dates;

    public ArrayList<String> getTimes() {
        return times;
    }

    public ArrayList<String> getMedications() {
        return medications;
    }

    public ArrayList<String> getDates() {
        return dates;
    }

    public void setTimes(ArrayList<String> times) {
        this.times = times;
    }

    public void setMedications(ArrayList<String> medications) {
        this.medications = medications;
    }

    public void setDates(ArrayList<String> dates) {
        this.dates = dates;
    }

    public MyMedications(ArrayList<String> medications, ArrayList<String> times, ArrayList<String> dates) {
        this.medications = medications;
        this.times = times;
        this.dates = dates;
    }

    public MyMedications() {
    }

    @Override
    public String toString() {
        return "MyMedications{" +
                "medications=" + medications +
                ", times=" + times +
                ", dates=" + dates +
                '}';
    }
}
