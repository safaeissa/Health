package com.example.health;
import java.util.ArrayList;
public class Role {
    private ArrayList<Doctors> Doctors1;
    private ArrayList<Doctors> Doctors2;
    private ArrayList<Doctors> Doctors3;
    private ArrayList<Doctors> Doctors4;
    private ArrayList<Doctors> Doctors5;
    private ArrayList<Doctors> Doctors6;
    private ArrayList<Doctors> Doctors7;
    private ArrayList<Doctors> Doctors8;
    private ArrayList<Doctors> Doctors9;
    private ArrayList<Doctors> Doctors10;
    private ArrayList<Doctors> Doctors11;
    private ArrayList<Doctors> Doctors12;
    private ArrayList<Doctors> Doctors13;
    private ArrayList<Doctors> Doctors14;
    private ArrayList<Doctors> Doctors15;
    private ArrayList<Doctors> Doctors16;
    private String time;
    private String date;

    public ArrayList<Doctors> getDoctors1() {
        return Doctors1;
    }

    public ArrayList<Doctors> getDoctors2() {
        return Doctors2;
    }

    public ArrayList<Doctors> getDoctors3() {
        return Doctors3;
    }

    public ArrayList<Doctors> getDoctors5() {
        return Doctors5;
    }

    public ArrayList<Doctors> getDoctors4() {
        return Doctors4;
    }

    public ArrayList<Doctors> getDoctors6() {
        return Doctors6;
    }

    public ArrayList<Doctors> getDoctors8() {
        return Doctors8;
    }

    public ArrayList<Doctors> getDoctors7() {
        return Doctors7;
    }

    public ArrayList<Doctors> getDoctors9() {
        return Doctors9;
    }

    public ArrayList<Doctors> getDoctors10() {
        return Doctors10;
    }

    public ArrayList<Doctors> getDoctors11() {
        return Doctors11;
    }

    public ArrayList<Doctors> getDoctors12() {
        return Doctors12;
    }

    public ArrayList<Doctors> getDoctors13() {
        return Doctors13;
    }

    public ArrayList<Doctors> getDoctors14() {
        return Doctors14;
    }

    public ArrayList<Doctors> getDoctors15() {
        return Doctors15;
    }

    public ArrayList<Doctors> getDoctors16() {
        return Doctors16;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public void setDoctors1(ArrayList<Doctors> doctors1) {
        Doctors1 = doctors1;
    }

    public void setDoctors2(ArrayList<Doctors> doctors2) {
        Doctors2 = doctors2;
    }

    public void setDoctors3(ArrayList<Doctors> doctors3) {
        Doctors3 = doctors3;
    }

    public void setDoctors4(ArrayList<Doctors> doctors4) {
        Doctors4 = doctors4;
    }

    public void setDoctors5(ArrayList<Doctors> doctors5) {
        Doctors5 = doctors5;
    }

    public void setDoctors6(ArrayList<Doctors> doctors6) {
        Doctors6 = doctors6;
    }

    public void setDoctors7(ArrayList<Doctors> doctors7) {
        Doctors7 = doctors7;
    }

    public void setDoctors8(ArrayList<Doctors> doctors8) {
        Doctors8 = doctors8;
    }

    public void setDoctors9(ArrayList<Doctors> doctors9) {
        Doctors9 = doctors9;
    }

    public void setDoctors11(ArrayList<Doctors> doctors11) {
        Doctors11 = doctors11;
    }

    public void setDoctors10(ArrayList<Doctors> doctors10) {
        Doctors10 = doctors10;
    }

    public void setDoctors12(ArrayList<Doctors> doctors12) {
        Doctors12 = doctors12;
    }

    public void setDoctors13(ArrayList<Doctors> doctors13) {
        Doctors13 = doctors13;
    }

    public void setDoctors14(ArrayList<Doctors> doctors14) {
        Doctors14 = doctors14;
    }

    public void setDoctors15(ArrayList<Doctors> doctors15) {
        Doctors15 = doctors15;
    }

    public void setDoctors16(ArrayList<Doctors> doctors16) {
        Doctors16 = doctors16;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Role() {
    }

    public Role(ArrayList<Doctors> doctors1, ArrayList<Doctors> doctors2, ArrayList<Doctors> doctors3, ArrayList<Doctors> doctors4, ArrayList<Doctors> doctors5, ArrayList<Doctors> doctors6, ArrayList<Doctors> doctors7, ArrayList<Doctors> doctors8, ArrayList<Doctors> doctors16, ArrayList<Doctors> doctors14, ArrayList<Doctors> doctors13, ArrayList<Doctors> doctors12, ArrayList<Doctors> doctors11, ArrayList<Doctors> doctors10, ArrayList<Doctors> doctors9, ArrayList<Doctors> doctors15, String time, String date) {
        Doctors1 = doctors1;
        Doctors2 = doctors2;
        Doctors3 = doctors3;
        Doctors4 = doctors4;
        Doctors5 = doctors5;
        Doctors6 = doctors6;
        Doctors7 = doctors7;
        Doctors8 = doctors8;
        Doctors16 = doctors16;
        Doctors14 = doctors14;
        Doctors13 = doctors13;
        Doctors12 = doctors12;
        Doctors11 = doctors11;
        Doctors10 = doctors10;
        Doctors9 = doctors9;
        Doctors15 = doctors15;
        this.time = time;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Role{" +
                "Doctors1=" + Doctors1 +
                ", Doctors2=" + Doctors2 +
                ", Doctors3=" + Doctors3 +
                ", Doctors4=" + Doctors4 +
                ", Doctors5=" + Doctors5 +
                ", Doctors6=" + Doctors6 +
                ", Doctors7=" + Doctors7 +
                ", Doctors8=" + Doctors8 +
                ", Doctors9=" + Doctors9 +
                ", Doctors10=" + Doctors10 +
                ", Doctors11=" + Doctors11 +
                ", Doctors12=" + Doctors12 +
                ", Doctors13=" + Doctors13 +
                ", Doctors14=" + Doctors14 +
                ", Doctors15=" + Doctors15 +
                ", Doctors16=" + Doctors16 +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
