package Mutable;

public class Immutalable {

public static void main(String[] args) {

String w=new String("Bag is weight");

String w1=new String("Bag is weight");

String h=w.concat(w1);

System.out.println(h);

System.out.println(System.identityHashCode(h));



StringBuffer m=new StringBuffer("Box is weight");

}
	}

