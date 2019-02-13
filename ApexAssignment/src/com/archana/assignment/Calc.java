package com.archana.assignment;

public class Calc {

				int a ,b,c;
				
				public int additionss(int i,int j)
				{	
					a=i;
					b=j;
					 
				    c = a+b;
				    
				    return c;		
				}
				
				
				
				public int substractions(int l, int m)
				{
					
					a=l;
					b=m;
					
					if(a>b)
					{
						
						c=a-b;				
					}
					
					else
					{
						c=b-a;
						
					}
					return c;
					
				}

				
				public int multiplicationss(int i,int j)
				{
					
					a=i;
					b=j;
					
					if (a!=0 && b!=0)
					{
					    c= a*b;
					    
					}
					else 
					{
						
						c=0;
						
					}
					return c;
				}
				
				public int Divisionss(int i, int j)
				{
					
					 a=i;
					 b=j;
				
					
					if (a!=0 && b!=0)
					{
					    c= a/b;
					    
					}
					else 
					{
						
						c=0;
					}
					return c;
				}

				public static void main(String[] args) {
					
				Calc P = new Calc();
				int g;
				
				g=P.additionss(10,20);
				System.out.println("Addition answer is");
				System.out.print(g);
				System.out.println("\n");
				
				int d ,e,f;
				d =P.substractions(50,25);
				System.out.println("Substraction answer is");
				System.out.print(d);
				System.out.println("\n");
				
				e=P.multiplicationss(25,25);
				System.out.println("Multiplication answer is");
				System.out.print(e);
				System.out.println("\n");
				
				f=P.Divisionss(100,25);
				System.out.println("Division answer is");
				System.out.print(f);
				System.out.println("\n");
				
				}

		
}
	


