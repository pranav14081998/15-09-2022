package com.arrayex.bll;

public class TestApartmentOwner {
	
	public static void main(String[] args) {
		ApartmentOwner pp = new ApartmentOwner("Pranav Pandey");   //making an object
		
		//set apartment wit their slot
		pp.setApartment("Mahakal Residence, 101", 0);
		pp.setApartment("Katyani Villa, 505", 1);
		pp.setApartment("Pradhan Kindom, 121", 2);
		pp.setApartment("Pareshmewari, 111", 3);
		pp.setApartment("Baidhya Villa, 444", 4);
		
		System.out.println(pp); //Print information of all the apartments
		
		System.out.println();
		
		System.out.println(pp.getOwner() + " has " + pp.countApartments() + " apartments"); //give total no. of apartment
	
		System.out.println("Apartment 2: " + pp.getApartment(2)); //get method of Apartment class
		
		System.out.println();
		
		pp.reorganizeApartments();
		System.out.println(pp);
	}

}


	
	
	


