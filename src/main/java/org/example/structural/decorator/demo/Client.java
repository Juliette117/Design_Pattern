package org.example.structural.decorator.demo;

public class Client {

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println(Coffee.getDescription() + "Cost : " + coffee.getPrice());

        Coffee coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println(Coffee.getDescription() + "Cost : " + coffeeWithMilk.getPrice());




    }
}
