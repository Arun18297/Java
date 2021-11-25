package StringPgms;

import java.util.LinkedHashSet;

public class RemoveDulicates {
	public static void main(String[] args) {
		String s="ghhjmmmiitfiuuuk";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			//remove duplicates only
			System.out.println(ch);
			/*int count=0;
			for(int i=0;i<s.length();i++) {
				if (ch==s.charAt(i)) {
					count++;
				}
			}

			if(count<=1) {
				//print only unique char in given order only
				System.out.println(ch);
			}*/
		}
	}
}
