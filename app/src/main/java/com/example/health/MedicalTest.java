package com.example.health;
import java.util.ArrayList;
public class MedicalTest {
    private ArrayList<String> tests;

    public ArrayList<String> getTests() {
        return tests;
    }

    public void setTests(ArrayList<String> tests) {
        this.tests = tests;
    }
    public MedicalTest(ArrayList<String> tests) {
        this.tests = tests;
    }
    public MedicalTest() {
    }
}
