package com.example.streams.challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StreamsTest {
	static List<Item> items = new ArrayList<>();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Collections.addAll(items, new Item(101,"Smart TV", "Pantalla 50 pulg", "Samsung",7000),
						   new Item(201,"Smart TV", "Pantalla 70 pulg", "LG",25000),
						   new Item(301,"Celular", "Galaxy S20", "Samsung",28000),
						   new Item(401,"Celular", "Redmi 9", "Xiaomi",12000),
						   new Item(501,"Consola VideoJuego", "PS5", "Sony",14000));
	}

	@Test
	void getCheapestItemTest() {
		assertEquals(7000, Streams.getCheapestItem(items));
	}
	
	@Test
	void getExpensiverItemTest() {
		assertEquals(28000, Streams.getexpensiverItem(items));
	}
	
	@Test
	void getManufacturerListTest() {
		List<String> listManuf = new ArrayList<>();
		Collections.addAll(listManuf, "LG", "Samsung", "Sony","Xiaomi");
		assertEquals(listManuf, Streams.getManufacturerList(items));
	}
	
	@Test
	void addAllPricesTest() {
		assertEquals(86000, Streams.addAllPrices(items));
	}
	
	@Test
	void getManufacturerStartSTest() {
		List<String> manu= new ArrayList<>();
		manu.add("Samsung");
		manu.add("Sony");
		assertEquals(manu, Streams.getManufacturerStartS(items));
	}

}
