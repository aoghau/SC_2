package com.company;

import java.io.Serializable;

public final class Product implements Serializable {
    private final String name;
    private final int cost;
    private final Destination destination;
    private volatile transient int hashCode;

    public Product(String name, int cost, Destination destination)
    {
        this.name = name;
        this.cost = cost;
        this.destination = new Destination(destination.getStreet(), destination.getNumber());
    }
    
    public String getName() { return name; }
    public int getCost() { return cost; }
    public Destination getDestination() { return new Destination(destination.getStreet(), destination.getNumber()); }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Product))
            return false;
        Product p = (Product)o;
        return (p.name.equals(this.name) && p.cost == this.cost &&
                p.destination.getStreet().equals(this.destination.getStreet()) &&
                p.destination.getNumber() == this.destination.getNumber()
        );
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = 7;
            result = 11 * result + cost;
            result = 11 * result + Integer.parseInt(name);
            result = 11 * result + Integer.parseInt(destination.getStreet());
            result = 11 * result + destination.getNumber();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Product: name = " + name + ", cost = " + cost + ", street = " + destination.getStreet() + ", number = " + destination.getNumber()";
    }
}
