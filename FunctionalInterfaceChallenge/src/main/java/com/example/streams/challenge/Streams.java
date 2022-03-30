package com.example.streams.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		Collections.addAll(items, new Item(101,"Smart TV", "Pantalla 50 pulg", "Samsung",7000),
						   new Item(201,"Smart TV", "Pantalla 70 pulg", "LG",25000),
						   new Item(301,"Celular", "Galaxy S20", "Samsung",28000),
						   new Item(401,"Celular", "Redmi 9", "Xiaomi",12000),
						   new Item(501,"Consola VideoJuego", "PS5", "Sony",14000));
		
//		System.out.println(Streams.getCheapestItem(items));
//		System.out.println(Streams.getexpensiverItem(items));
//		System.out.println(Streams.getManufacturerList(items));
//		System.out.println(Streams.addAllPrices(items));
//		System.out.println(Streams.getManufacturerStartS(items));
		System.out.println(Streams.getChepeastProduct(items, 12000));

	}
	
	//Show the cheapest price
	public static int getCheapestItem(List<Item> items) {
		return items.stream().mapToInt(i -> i.getPrice()).min().getAsInt();

	}
	
	//Show the expensiver price
	public static int getexpensiverItem(List<Item> items) {
		return items.stream().mapToInt(i -> i.getPrice()).max().getAsInt();

	}
	
	//Show a list of manufacturers in order and without duplicates
	public static List<String> getManufacturerList(List<Item> items) {
		return items.stream()
		.map(item -> item.getManufacturer()).sorted().distinct().collect(Collectors.toList());
	}
	
	//Show the add of all prices in the list Item
	public static int addAllPrices(List<Item> items) {
		return items.stream()
		.map(item -> item.getPrice()).reduce(Integer::sum).get();
	}
	
	//Show a list of manufacturers name starts with letter 'S'
	public static List<String> getManufacturerStartS(List<Item> items) {
		return items.stream()
		  .filter(item -> item.getManufacturer().startsWith("S"))
		  .map(i -> i.getManufacturer()).distinct()
		  .collect(Collectors.toList());
	}
	
	public static List<Item> getChepeastProduct(List<Item> products, int price) {
	    return products.stream().filter(i -> i.getPrice() <= price).collect(Collectors.toList());
		//return products.stream().map(i -> i.getPrice()).filter(n -> n <= price).collect(Collectors.toList());
	  }

}
