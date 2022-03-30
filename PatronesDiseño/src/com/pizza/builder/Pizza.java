package com.pizza.builder;

public class Pizza {
	private final String sauce;
	private final String cheese;
	private final String base;
	
	private Pizza(PizzaBuilder pizzaBuilder) {
		this.sauce = pizzaBuilder.sauce;
		this.cheese = pizzaBuilder.cheese;
		this.base = pizzaBuilder.base;
	}

	public String getSauce() {
		return sauce;
	}

	public String getCheese() {
		return cheese;
	}

	public String getBase() {
		return base;
	}

	@Override
	public String toString() {
		return "Ingredientes [sauce=" + sauce + ", cheese=" + cheese + ", base=" + base + "]";
	}
	
	public static class PizzaBuilder {
		private  String sauce;
		private  String cheese;
		private  String base;
		
		public PizzaBuilder() {
			
		}
		
		public PizzaBuilder sauce(String sauce) {
			this.sauce = sauce;
			return this;
		}
		
		public PizzaBuilder cheese(String cheese) {
			this.cheese = cheese;
			return this;
		}
		
		public PizzaBuilder base(String base) {
			this.base = base;
			return this;
		}
		
		public Pizza build() {
			return new Pizza(this);
			
		}
		
	}
	
}
