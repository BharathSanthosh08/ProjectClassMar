package Mutable;

public class Vocabulary {
	public static void main(String[] args) {
	String a="Program is not working @234cw";

	int Count=0;
	int c=0;
	int s=0;
	String h="";
	String k="";

	for(int i=0;i<a.length();i++) {
	char d= a.charAt(i);
	if(d=='a'&&d=='e'||d=='i'||d=='o'&&d=='u') {

	Count++;

	h=h+d;
	}
	else

		if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u'|| d=='P') {
		c++;
		k=k+d;

		}

		else {

		s++;

		}

		}

		System.out.println(Count); System.out.println(h);

		System.out.println(c);

		System.out.println(k);

		System.out.println(s);

		}

		}
	
	

