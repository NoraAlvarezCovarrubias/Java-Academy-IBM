package com.example.collections.array;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Theatre {
	
	private String name;
	static List<Seat> listReserve = new ArrayList<>();
	final Integer numRow = 8;
	final Integer numSeat = 8;
	static String message;

	
	public static String reserve(String seat) {
		Pattern pat = Pattern.compile("[A-H][1-8]");
		Matcher mat = pat.matcher(seat.toUpperCase());
		
		if (seat != null && mat.matches()) {
			Seat auxSeat = new Seat();
			auxSeat.setLine(seat.substring(0, 1).toUpperCase());
			auxSeat.setRow(Integer.parseInt(seat.substring(1, 2)));
			auxSeat.setPrice(50f);
			boolean existe = isrepeat(auxSeat);
			if(!existe) {
				listReserve.add(auxSeat);
				message="Reservado correctamente";
			}else {
				message="Asiento ya esta reservado";
			}
		} else {
			System.out.println("NO es un asiento valido");
			message= "Asiento invalido ";
			return message;
		}
		return message;
		
	}
	
	public static boolean cancelReservation(String seatToCancel) {
		System.out.println(listReserve);
		boolean cancel= listReserve
		.removeIf(current -> current.getLine().concat(current.getRow().toString()).equals(seatToCancel));

		if(cancel) {
			System.out.println("Reservación canceladada");
		}else {
			System.out.println("No se encontro reservación con ese número de asiento");
			return false;
		}
		return true;
		
	}
	
	public void printSeating(Seat seat) {
		
	}
	
	public static boolean isrepeat(Seat auxSeat) {
		if(listReserve.contains(auxSeat))
			return true;
		else
			return false;
		
	}
	
	/*
	Zona de los archivos adjuntos
	# List Challenge
	You are writing an application to reserve seats for a Theatre using a list of objects.
	The Theatre has *i* number of rows named by a capital letter from A-H (i) and *i* number of seats per row (cols);

	- Create a Seat class with line, row and price properties.
	- Create a Theatre class with a name, list of seats, number of rows and number of seats.
	- Add methods to *reserve*, *cancel reservation* and *print* seating chart
	- The reserve method must prevent **dups**
	- *print* method will show free, reserved and total amount of sold seats, free and reserved.

	Use JUnit to verify methods.

	## Example
	Having a 8x8 theatre

	### Input:

	Reserve following seats: {"a3","A4","A7","D3","D4","D5","C7","B4","H7"}  
	Validate these not allowed: {"a0","A400","X7","","00","AA","D4"}  
	Cancel: {"A4"}  

	### Output

	Output should looks similar. Price $50

	Java Cinema  
	`..[A3][A4]..[A7].`  
	`...[B4]....`  
	`......[C7].`  
	`..[D3][D4][D5]...`  
	`........`  
	`........`  
	`........`  
	`......[H7].`  
	`........`  
	Total Available: 55  
	Total Sold: 9  
	Total Income: 450  

	## Hints  

	Junit  
	* ParameterizedTest
	* Order
	* ValueSource
	* MethodSource
	* CsvSource

	Regex
	Collections
	String
	Integer
	list-challenge.md
	Mostrando list-challenge.md.
	 * 
	 * */

}
