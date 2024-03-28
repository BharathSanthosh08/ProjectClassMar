package MechBlock;


import java.util.HashSet;

import java.util.Set;

public class NewClass {
	public static void main(String[] args) {
		Set<Cls>l= new HashSet<>();
	
	Cls b = new Cls();
	b.setId(123);
	b.setName("BHARATH");
	b.setMobile(9677514917l);
	
	Cls b1 = new Cls();
	b1.setId(122);
	b1.setName("RAGHUL");
	b1.setMobile(9657023625l);
	
	
	l.add(b);
	l.add(b1);
	for (Cls x:l) {
		
		System.out.println(x.getId());
		System.out.println(x.getName());
		System.out.println(x.getMobile());
		
	}
	}
	

}
