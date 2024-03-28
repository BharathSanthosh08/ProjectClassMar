package MechBlock;

public class Parent{
	
final  int a=100;//// final  over riding
	public void method() {
//a=200;
			System.out.println(a );
	}
	
	public void  method2() {
//a = 300;
		System.out.println(a);
	}



public static void main(String[] args) {
	Parent f = new Parent();
	f.method();
	f.method2();
	System.out.println(f.a);
		
}
}
