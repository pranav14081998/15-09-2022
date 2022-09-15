package com.arrayex.bll;

import java.util.Scanner;

public class AverageValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = {3,5,6,2,4};
		System.out.println("Enter" +nums.length+"value:");
		
		int max = nums[0];
		int min = nums[0];
		float sum = nums[0];
		for (int i = 1; i<nums.length; i++) {
			sum += nums[i];
			if(nums[i]>max)
				max = nums[i];
			else if(nums[i]<min)
				min = nums[i];
		}
		float x = ((sum-max-min) / (nums.length - 2));
		System.out.println("Maximum no. is "+max);
		System.out.println("Minimum no. is "+min);
		System.out.printf("Compute the average of an array of integers except the largest and smallest values: %.2f", x);
		System.out.print("\n");
		
	}

}
