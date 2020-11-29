package com.company;

public class Main {

    public static void main(String[] args) {
        Destination destination = new Destination("Nijinska", 29);
        Product Teapot = new Product("Teapot", 300, destination);

        System.out.println("Product's name: " + Teapot.getName());
        System.out.println("Product's id: " + Teapot.getCost());
        System.out.println("Product's destination street: " + Teapot.getDestination().getStreet());
        System.out.println("Product's destination building number: " + Teapot.getDestination().getNumber());

        destination.setStreet("Huzara");
        destination.setNumber(1);

        System.out.println();

        System.out.println("Product's name: " + Teapot.getName());
        System.out.println("Product's id: " + Teapot.getCost());
        System.out.println("Product's destination street: " + Teapot.getDestination().getStreet());
        System.out.println("Product's destination building number: " + Teapot.getDestination().getNumber());
    }
}
