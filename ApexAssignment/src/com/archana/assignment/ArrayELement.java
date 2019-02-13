package com.archana.assignment;

import java.util.Scanner;

public class ArrayELement {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
	    int myArray[];
	    myArray = new int[10];
		System.out.println("Enter the Elemetn of the array");
		for (int i=0;i<10;i++) {
			  myArray[i] = s.nextInt();			
			
		}
		
		System.out.println("Array Elements are");
		for(int j=0;j<10;j++)
		{
			
			System.out.println("index"+j+ "="+ myArray[j]);
		}
		
	}

}
