package com.pizza.builder;

public class RunPizza {

	public static void main(String[] args) {
		Pizza peperoni= new Pizza.PizzaBuilder()
				.base("Crunch")
				.cheese("Mozzarella")
				.sauce("Tomate Sauce").build();
		
		System.out.println("Pizza Peperoni " + peperoni);
		
		Pizza kids= new Pizza.PizzaBuilder()
				.base("Jam and Cheese Shore")
				.cheese("Gouda")
				.build();
		
		System.out.println("Pizza for kids " + kids);

	}

}
