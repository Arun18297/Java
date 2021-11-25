package Array;

public class HappyNum {
public static void main(String[] args) {
	int n=1261;
	System.out.println(n);
	while(n>9) {
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		n=sum;
	}
	
	if(n==1) {
		System.out.println("It is happy num");
	}
	else {
		System.out.println("It is not happy num");
	}
}
}
