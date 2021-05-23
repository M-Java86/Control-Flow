package com.qa.controlflow.javabeginner.conditionals;

// class has a scope
public class Runner {

	// Member - attributes
	// public static int id;
	// public static String msg = "Hello World";
	// static double passMark = 70;

	// Member - Method has a scope
	public static void main(String[] args) {
		// if , else if, else
		// switch case

		switch (1) {
		case 1:
			System.out.println("This number is one");
			break;

		case 2:
			System.out.println("This is two");
			break;

		case 3:
			System.out.println("This is three");
			break;

		case 4:
			System.out.println("This is four");
			break;

		default:
			System.out.println("This is not a number I know of");

		}

	}

}

// logical operators 
// - bitwise 
// - AND - &(Condition 1 & Condition2)
// true true - true 
// false true - false 
// false false - false
// OR - | (Condition | Condition2)

//the "if" keyword in java is accompanied with its own brackets and parenthesis, also
//Can't use = here because it's basically saying that passMark is = to 80. == comparison operator	
// it included it's own scope. 

// == equals compare
// == > Greater than
// == < Less than 
// >= Greater than or Equal to
// <= Less than or Equal to		