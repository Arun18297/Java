package StringPgms;

import java.util.HashSet;

/*create set coll and add all the char ofgiven string into set
 * compare each char of set with all the char of give string
 * if char is matcjing , increment count
 * print both char and count
 * */

public class CountDuplicateChars {

	public static void main(String[] args) {
		String s="ghhjmmmiitfiuuuk";
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if (ch==s.charAt(i)) {
					count++;
				}
				
			}			
			if(count>1) {
				//To print Duplicate character only
				System.out.println(ch+"==>"+count);
			}
			
		}
	}
}
