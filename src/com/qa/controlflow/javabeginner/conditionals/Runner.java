package com.qa.controlflow.javabeginner.conditionals;

// class has a scope
public class Runner {
	
	// Member - attributes
	public static int id;
	public static String msg = "Hello Wolrd";
	public static double passMark = 70%;
	
	//Member - Method has a scope 
	public static void main(String[] args) {
		double percent = 80.0;
		
		if(percent == 80.0) { //the "if" keyword in java is accompanied with its own brackets and parenthesis, also
			//Can't use = here because it's basically saying that passMark is = to 80. == comparison operator	
			// it included it's own scope. 
			
			System.out.println(percent + "%");
	
		
		
		System.out.println("You have passed!");
	}
	
	
	

}
	
}
