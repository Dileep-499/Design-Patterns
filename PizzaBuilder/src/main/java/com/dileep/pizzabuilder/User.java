package com.dileep.pizzabuilder;

import com.dileep.pizzabuilder.Builder.PizzaBuilder;
import com.dileep.pizzabuilder.Printer.Printing;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        PizzaBuilder pizzaBuilder;
        pizzaBuilder = new PizzaBuilder.Builder()
                .doughType("thick")
                .doughSize("medium")
                .edgeStyle("cheese-stuffed")
                .sauceType("BBQ")
                .sauceLayering("under cheese")
                .cheeseType("Cheddar")
                .cheeseAmount("extra")
                .build();
        System.out.println("Please Enter your name");
        name = s.next();
        Printing.display(pizzaBuilder, name);


        pizzaBuilder = new PizzaBuilder.Builder()
                .doughType("Thin")
                .doughSize("Extra large")
                .cheeseType("Mozzarella")
                .cheeseAmount("Reular")
                .build();
        System.out.println("Please Enter your name");
        name = s.next();
        Printing.display(pizzaBuilder, name);


    }
}
