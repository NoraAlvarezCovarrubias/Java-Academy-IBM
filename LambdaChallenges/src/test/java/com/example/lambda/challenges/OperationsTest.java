package com.example.lambda.challenges;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OperationsTest {
	BasicOperations basicOperations;

	@Test
	void addTest() {
		BasicOperations add = (num1,num2) -> num1+num2;
		assertEquals(13,Operations.addSub(add, 8, 5));
	}
	
	@Test
	void subTest() {
		BasicOperations add = (num1,num2) -> num1-num2;
		assertEquals(3,Operations.addSub(add, 8, 5));
	}
}
