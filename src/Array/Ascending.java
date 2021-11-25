package Array;

public class Ascending {
	public static void main(String[] args) {
		String s[]= {"hello","buddy","how","are", "you"};
		String max=s[0];
		for(int i=1;i<s.length;i++) {
			if(s[i].length()>max.length()) {
				max=s[i];
			}
			
		}
		System.out.println(max);
		for(int i=0;i<s.length;i++) {
			if(max.length()<=s[i].length()) {
				System.out.println(s[i]);
			}
		}

	}
}
