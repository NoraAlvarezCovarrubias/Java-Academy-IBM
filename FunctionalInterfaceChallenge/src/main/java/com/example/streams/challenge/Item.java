package com.example.streams.challenge;

public class Item {
	private int id;
	private String name;
	private String description;
	private String manufacturer;
	private int price;
	
	public Item(int id, String name, String description, String manufacturer, int price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + ", manufacturer=" + manufacturer
				+ ", price=" + price + "]";
	}

}
