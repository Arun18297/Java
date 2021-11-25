package StringPgms;

public class ReverseWithout3rdVariable {
public static void main(String[] args) {
	String s="hello";
	
	for(int i=0;i<s.length();i++) {
		//System.out.print(s.charAt(i));
	}
	for(int i=s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));
	}
}
}
