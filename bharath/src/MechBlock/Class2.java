package MechBlock;

public class Class2 {
	
	public static void main(String[] args) {
	int a=1235;
	int i,j=0;
	 
	while(a>0) {
		i=a%10;
		j=(j*10)+i;
		a=a/10;
	}
	System.out.println(j);

	}}
