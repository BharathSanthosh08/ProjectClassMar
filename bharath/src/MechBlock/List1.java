package MechBlock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class List1 {
	
	public static void main(String[] args) {
	List<Integer> b= new ArrayList<>();
	b.add(125);
	b.add(356);
	b.add(223);
	b.add(345);
	b.add(1000);
	b.add(45);
	b.add(125);
	
	Integer s=b.size();
	System.out.println(s);
	
	b.add(3,300 );
	
	b.add(225);
	b.set(0, 100);
	
	System.out.println(b);
	
	for(int i=0;i<b.size();i++){
		int k=b.get(i);
	System.out.println(k);
	}
	Collections.sort(b);
	System.out.println(b);
	
	Collections.reverse(b);
	System.out.println(b);
	
	int t=b.indexOf(12);	
	System.out.println(t);

	int d=b.lastIndexOf(223);	
	System.out.println(d);
	List<String> f= new ArrayList<>();
	
f.add("hi");
f.add("hello");

String h=f.get(1);
System.out.println(h);

boolean r=f.contains("hi");
System.out.println(r);

///b.clear();
///System.out.println(b);
	List<Integer> b1=new ArrayList<>();
	b1.add(100);
	b1.add(234);
	b1.add(345);
	
	
	//b.retainAll(b1);
	//System.out.println(b);
	
	//b.removeAll(b1);
	//System.out.println(b);
	b1.remove(2);
	System.out.println(b1);
	
	ListIterator<Integer> p=b.listIterator();
	while(p.hasNext()) {
		System.out.println(p.next());
	}
	while(p.hasPrevious()) {
		System.out.println(p.previous());
		}
	
	
	}

}
