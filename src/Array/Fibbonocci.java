package Array;

public class Fibbonocci {
public static void main(String[] args) {
	int a=0;
	int b=1;
	System.out.print(a+" ");
	//System.out.print(b+" ");
	for(int i=1;i<=20;i++) {
		int c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}
}
}
