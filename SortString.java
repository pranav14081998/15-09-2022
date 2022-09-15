package com.arrayex.bll;

import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Creating array for numeric value
		int nums[]=new int[5];
		//Creating array for string value
		String names[] = new String[5];
		
		//Taking value of string
		System.out.println("Enter " + names.length + " String values: ");
		for(int i=0; i<names.length; i++) {
			names[i] = sc.nextLine();  
		}
		//Taking value of numeric
		System.out.println("Enter " + nums.length + " Numeric values: ");
		for(int i=0; i<nums.length; i++) 
			nums[i] = sc.nextInt();
		
		//Before Sorting numeric
		
		System.out.println("Numeric Values before sorting: ");
		for(int i=0; i<nums.length; i++)
			System.out.println(nums[i]);
		//before sorting string
		System.out.println("String values Before Sorting :");
		for(int i= 0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		//Sorting part of String
		
		for(int i=0; i<names.length; i++) {
			for(int j=i+1;j<names.length;j++) {
			if(names[i].compareTo(names[j])>0){
				String temp= names[i];
				names[i]=names[j];
				names[j]=temp;
			}
			}
		}
	//Sorting part of Numeric
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		//After Sorting of numeric
		
		System.out.println("Values after sorting in ascending order:");
		for(int i=0; i<nums.length; i++)
			System.out.println(nums[i]);
		//After Sorting of string
		System.out.println("String value After Sorting :");
		for(int i= 0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}

}
