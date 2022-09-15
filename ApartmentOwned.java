package com.arrayex.bll;

public class ApartmentOwned {
	
	private String owner;
	private String[] apartments;
	
	public ApartmentOwned() {  //Default constructor
		
	}
	
	public ApartmentOwned(String owner) {   //Constructor with one parameter
		this.owner = owner;
		apartments = new String[10];
	}
	
	public String getOwner() {  //Returns owner of apartment
		return owner;
	}
	
	public String getApartment(int slot) {    //Return address at particular slot
		return apartments[slot];
	}

	public void setApartment(String address, int slot) {   //Assigning the address to particular slot
		apartments[slot] = address;
	}

	public int countApartments() {     //returns number of apartment
		int num = 0;
		for (int i = 0; i < 10; i++)
			if (apartments[i] != null)
				num++;
		
		return num;
	}
	
	public void reorganizeApartments() {   //Reorganize array of apartment
		int empty = -1; // index of the first empty slot
		
		for (int i = 0; i < 10; i++) {
			if (apartments[i] == null && empty == -1)
				empty = i;
			
			if (apartments[i] != null && empty != -1) {
				apartments[empty] = apartments[i];
				apartments[i] = null;
				empty++;
			}
		}
	}
	
	public String toString() {     // Return information about object
		String ris = "";
		ris += "Owner: " + owner;
		
		for (int i = 0; i < 10; i++)
			if (apartments[i] != null)
				ris += "\nApartment " + i + ": " + apartments[i];
		
		return ris;
	}
}

	

	


