package com.qa.controlflow.javabeginner.conditionals;

// class has a scope
public class Runner {
	
	// Member - attributes
	public static int id;
	public static String msg = "Hello Wolrd";
	static double passMark = 70;
	
	
	//Member - Method has a scope 
	public static void main(String[] args) {
		double percent = 65.0;
		boolean flag = false;
		
		System.out.println(percent + "%");
		
		if(percent > passMark) {
			System.out.println("You have passed!");
			} else if(percent == passMark  || flag) {
			System.out.print("You have JUST passed!");
			}	else {
			System.out.println("You have failed!");
		
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