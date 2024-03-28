package FIirstFloor;

public class ChildThree implements Sample,SampleOne {

		
	
	
	@Override
	public void santhosh() {
		System.out.println("my name 1");
		
	}

	@Override
	public void pranav() {
		
		System.out.println("my name 2");
	}

	@Override
	public void bharath() {
		System.out.println("my name 3");
		
	}

	@Override
	public void sampath() {
		System.out.println("my name 4");
		
	}
	
	public static void main(String[] args) {
	ChildThree b= new ChildThree();
	;b.santhosh();
	b.pranav();
b.bharath();
	b.sampath();
		
	}

}
