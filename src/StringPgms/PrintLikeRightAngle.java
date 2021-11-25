package StringPgms;

public class PrintLikeRightAngle {
	public static void main(String[] args) {
		
	String s="asdfghj";
	String rev="";
	String con="";	
	
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		System.out.println(rev);
		con=rev;
	}
	
	/*for(int i=con.length()-1;i>0;i--) {
		StringBuilder sb=new StringBuilder(con);
		String rem = sb.deleteCharAt(i);
		con=rem;
		System.out.println(rem);	
	}*/
	
}


}
