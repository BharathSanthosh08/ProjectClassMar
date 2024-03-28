package Mutable;

public class Mutable {
	public static  void main(String[] args) {
		StingBuffer c=new StringBuffer("Bag is weight"); 
		StringBuffer c1=new StringBuffer("Bag is weight");
		StringBuffer c1=c.append(c1);
		System.out.println(c1);
		System.out.println(System.identityHashCode(c1));

	}


}
