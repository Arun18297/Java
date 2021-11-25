package StringPgms;

public class SwapString {
	public static void main(String[] args) {
		String s1="abc";
		String s2="xyz";
		s1=s1+s2;//=abcxyz
		s2=s1.substring(0,s1.length()-s2.length());//=abc
		//from 0th index till s1-s2th (0,4)index will be preserved rest eliminated //where s1 here is new//s2=abc
		s1=s1.substring(s2.length());//=xyz
		//abcxyz----->abc.lenght
		System.out.println(s1);
		System.out.println(s2);
	}

}

