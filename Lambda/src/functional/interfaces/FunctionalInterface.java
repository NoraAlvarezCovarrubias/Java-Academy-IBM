package functional.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalInterface {

	public static void main(String[] args) {
		
		Function<String, String> toUpper = str -> str.toUpperCase();
		System.out.println(toUpper.apply("Academy"));
		
		//Dos argumentos y el resultado
		BiFunction<String, String, String> concat = (str1,str2) -> str1 + " " + str2;
		System.out.println(concat.apply("Java", "Academy"));
		
		
		List<Item> items= new ArrayList<>();
		Collections.addAll(items, 
							new Item("Iphone", 30),
							new Item ("Samsung", 40),
							new Item("Xiaomi",15));
		
		List<String> itmNams= items.stream().map(i -> i.getName()).collect(Collectors.toList());
		
		/*for(String nam:itmNams) {
			System.out.println(nam);
		}*/
		//itmNams.forEach(n -> System.out.println(n));
		itmNams.forEach(System.out::println);
		
//		List<Offer> offers= items.stream().map(i ->{
//			if(i.getPrice()<=40) {
//				return new Offer(i, 5);
//			}else {
//				return new Offer(i, 10);
//			}
//		}).collect(Collectors.toList());
		List<Offer> offers  = items.stream().map(i -> i.getPrice() < 40 ?  new Offer(i, 5) : new Offer(i, 10)      
			    ).collect(Collectors.toList());
		
		/*for(Offer ofr:offers) {
			System.out.println(ofr);
		}*/
		
		offers.forEach(o -> System.out.println(o));
		
		//Supplier
		Supplier<Integer> supInt = () -> new Random().nextInt(10);
		System.out.println(supInt.get());
		
		Supplier<IntStream> mulInt = () -> new Random().ints(10,0,10).distinct();
	    Stream.generate(mulInt).findFirst().get()
					.forEach(System.out::println);
	    
	    //Predicate
	    Predicate<Item> filterByPrice = i -> i.getPrice() < 20;
	    for (Item i: items) {
	    	if(filterByPrice.test(i)) {
	    		System.out.println(i);
	    	}
	    }
	    items.stream().filter( i -> i.getPrice() < 31).collect(Collectors.toList()).forEach(System.out::println);

	}

}

class Offer{
	private Item item;
	private int disc;
	public Offer(Item item, int disc) {
		this.item = item;
		this.disc = disc;
	}
	public Item getItem() {
		return item;
	}
	public int getDisc() {
		return disc;
	}
	
	@Override
	public String toString() {
		return "Offer [item=" + item + ", disc=" + disc + "]";
	}
	
}

class Item{
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
	
}
