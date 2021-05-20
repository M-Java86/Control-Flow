package com.qa.controlflow.oop.inheritance;

public class Animal {
	
	private String species;
	private String origin;
	
	public Animal() {
		this("Mamma1", "Mamma1");
		
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
	
		public String getOrigin() {
			return origin;
		}
	 
	 
	 
	 public void setOrigin(String origin) {
			this.origin = origin; 
	 
}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		return true;
	}
	 

	 
}



