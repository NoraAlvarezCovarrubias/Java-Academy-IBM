package com.example.collections.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class TheatreTest {

	@Order(1)
	@ParameterizedTest
	@ValueSource(strings = {"a3","A4","A7","D3","D4","D5","C7","B4","H7"})
	public void testReserve(String seat) {
		assertEquals("Reservado correctamente", Theatre.reserve(seat));
	}
	
	@Order(2)
	@ParameterizedTest
	@ValueSource(strings = {"D4","a0","A400","X7","","00","AA"})
	public void testReserveFail(String seat) {
		assertEquals("Reservado correctamente",Theatre.reserve(seat));
	}

	@Order(3)
	@ParameterizedTest
	@ValueSource(strings = {"A4"})
	public void testCancelReservation(String seat) {
		assertEquals("Asiento cancelado con exito ",Theatre.cancelReservation(seat));
	}
	
	@Order(4)
	@ParameterizedTest
	@ValueSource(strings = {"A0"})
	public void testCancelReservationFail(String seat) {
		assertEquals("Asiento cancelado con exito ",Theatre.cancelReservation(seat));
	}

}
