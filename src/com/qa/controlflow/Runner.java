package com.qa.controlflow;

import com.qa.controlflow.oop.inheritance.Animal;

public class Runner {
	
	
	
	public static void main(String[]  args) {
		Animal a = new Duck ("Mammal", "UK");
		Animal a2 = new Duck("Mamma1",  "UK");
		
		System.out.println(a);
		
		System.out.println(a.getSpecies());
		System.out.println(a.getOrigin());
		
		//everything in java is -a object
		// - everything inherits from object
		
		System.out.println(a.equals(a2));
	}
	
}
		
		
