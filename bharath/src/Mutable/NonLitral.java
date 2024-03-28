package Mutable;

public class NonLitral {
	
	public static void main(String[] args) {

		String g=new String("Bag is weight");

		String g1=new String("Bag is weight");

		System.out.println(System.identityHashCode(g));

		System.out.println(System.identityHashCode(g1));

	}

}
