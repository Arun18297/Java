package StringPgms;

public class WithoutLength {
	public static void main(String[] args) {
		String s="hello";
		String leng="";

		int len=s.compareTo(leng);

		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}

