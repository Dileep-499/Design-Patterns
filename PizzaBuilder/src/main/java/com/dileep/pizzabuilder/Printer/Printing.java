package com.dileep.pizzabuilder.Printer;

import com.dileep.pizzabuilder.Builder.PizzaBuilder;

public class Printing {
    public  static  void  display(PizzaBuilder pizzaBuilder,String name){
      System.out.println(pizzaBuilder.describePizza(name));
    }
}
