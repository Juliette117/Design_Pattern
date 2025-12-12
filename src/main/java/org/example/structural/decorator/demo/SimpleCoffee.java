package org.example.structural.decorator.demo;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Café";
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
