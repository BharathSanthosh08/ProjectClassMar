package FIirstFloor;

public class ChildOne  implements Sample,SampleOne {

	@Override
	public void santhosh() {
		System.out.println("my name");
		
	}	
	

	@Override
	public void bharath() {
		System.out.println("my second name");		
	}

	@Override
	public void sampath() {
		System.out.println("my name ");
	
	}
	
	@Override
	public void pranav() {
		System.out.println("my name two ");
		
	}
	
public static  void main(String[] args) {
		
		ChildOne c= new ChildOne();
		c.bharath();
		c.sampath();
		c.pranav();
		c.santhosh();
	}
}