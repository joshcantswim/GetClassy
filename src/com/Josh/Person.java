package com.Josh;

import java.util.Calendar;

public class Person {

    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String fullName(){
        return firstName + " " + lastName;
    }

    public String formalName(){
        return title + " " + fullName();
    }

    public static int getAge(int year){

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        return currentYear - year;
    }

    public String toCSVDataRecord(){
        return ID + "," + firstName + "," + lastName + "," + title + "," + YOB;
    }

    public Person(String ID, String firstName, String lastName, String title, int YOB){
        setID(ID);
        setFirstName(firstName);
        setLastName(lastName);
        setTitle(title);
        setYOB(YOB);
    }


}
