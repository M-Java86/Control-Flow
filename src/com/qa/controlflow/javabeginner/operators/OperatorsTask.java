package com.qa.controlflow.javabeginner.operators;

// Operators are symbols that allow us to perform mathematical operations 
// + -Addition
//'-' -Subtraction
// * -Multiplication
// '/' -Division
// '%' -Modulus

//PEMDAS
//BIDMAS

	public class OperatorsTask {
		public static int id;
		public static String msg = "Hello World";
		
		public static void main(String[]  arg) {
			int result;
			//11/3) -(8)-BIDMAS Calculation
			
			result = 3 / (3 + 8) -2 * 4;
			
			System.out.println(result);
			//printThese(12, 24);
		}
		
		public static void printThese(int num1, int num2) {
			System.out.println(num1);
			System.out.println(num2);
			
		}
		
		public static int add(int num1, int num2) {
			return num1 + num2;
		}
}
	
	