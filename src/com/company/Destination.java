package com.company;

import java.io.Serializable;

public class Destination implements Serializable {
    private String street;
    private int number;

    public Destination(String street, int number)
    {
        this.street = street;
        this.number = number;
    }

    public String getStreet() { return this.street; }
    public void setStreet(String street) { this.street = street; }
    public int getNumber() { return this.number; }
    public void setNumber(int number) { this.number = number; }
}