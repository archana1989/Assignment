package com.archana.assignment;

//Write a program to a specified number of generated fibonacci series 

import java.util.Scanner;  

public class Fb_Series {

	public static void main(String[] args) {
		int a=0, b=0, c=1 , n;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of fibonaccie series" );
		
        n= s.nextInt();
        
        System.out.println("Fibonaccie series are ");
        
        for (int i= 0 ; i<n; i++)
        {
        	
        	a=b;
        	b=c;
        	c=a+b;
        	
        	System.out.println(a + " ");
        	
        }
        
	}

}
