package org.example.structural.decorator.demo;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.0;
    }

    public String getDescription() {
        return coffee.getDescription() + " avec du lait";
    }
}
