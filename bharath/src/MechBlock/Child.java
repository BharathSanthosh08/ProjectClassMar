package MechBlock;

import java.util.Scanner;

public  class Child  {
	
	public static void main(String[] args) {
		
		StringBuffer c=new StringBuffer("Bag is weight");  	
		StringBuffer c1=new StringBuffer("Bag is weight"); 
		StringBuffer d1=c.append(c1);
		System.out.println(d1);
		System.out.println(System.identityHashCode(d1));

			
		}
}			
				
				
				
				
					
				
				
		
