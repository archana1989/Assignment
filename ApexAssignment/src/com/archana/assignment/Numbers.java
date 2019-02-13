package com.archana.assignment;

public class Numbers {

	public static void main(String[] args) {
		
		System.out.println("1000 Numbers are");
		for(int i=1;i<=1000;i++)
		{
			
			System.out.println(i);
		}

		System.out.println("odd munbers between 1 and 1000  are");
		for(int i =0;i<=1000;i++)
		{
			if( i%2 != 0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("Number whic is multiple by 5 are");
		for (int i=0;i<=1000;i++) 
		{
			if (i%5 == 0)
			{
				
				System.out.println(i);
			}	
			
		}
	}

}
