package com.qa.controlflow.oop.inheritance;

public class Animal {
	
	protected String species;
	private String origin;
	
	public Animal() {
		this("Unkown", "Unknown");
		
	}
	public Animal(String species, String origin) {
		this.species = species;
		this.origin = origin;
		
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
}	


