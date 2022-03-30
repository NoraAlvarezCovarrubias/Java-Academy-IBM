package com.example.streams.challenge;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(description, id, manufacturer, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(description, other.description) && id == other.id
				&& Objects.equals(manufacturer, other.manufacturer) && Objects.equals(name, other.name)
				&& price == other.price;
	}
	
	

}
