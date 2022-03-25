package com.example.lambda.challenges;

public class Operations {

	public static void main(String[] args) {
		BasicOperations add = (num1,num2) -> num1+num2;
		BasicOperations sub= (num1,num2) -> num1-num2;
		CompareNum odd=(num) -> num % 2 == 0;
		CompareNum isPrime=(num) -> {
			for (int x = 2; x < num / 2; x++) {
			    if (num % x == 0)
			      return false;
			  }
			return true;
		};
		Factorial factorial= (num) ->{
			int base =1;
			
			for( int i = 1; i <= num; i++ ) {
		         base *= i;
		      }
			return base;
		};
			
		//Para usar lambda asi, se necesita el metodo static de abajo?
		System.out.println(addSub(add, 8, 5));	
		System.out.println(addSub(sub, 10, 5));
		System.out.println(compare(odd, 6));
		//Otra forma de usar lambda (sin hace el metodo static de abajo)
		System.out.println(isPrime.compare(50));
		System.out.println(factorial.calcFactorial(8));
	}
	
	public static int addSub(BasicOperations lf, int num1, int num2) {
		return lf.operation(num1, num2);
	}
	
	public static boolean compare(CompareNum lf, int num) {
		return lf.compare(num);
	}

}
