package StringPgms;

public class PrintOvels {
	public static void main(String[] args) {
		String ovel="aeiouAEIOU";
		String s="ajokligajeyuAYOIEUJG";
		String owel="";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<ovel.length();j++) {
				if(s.charAt(i)==ovel.charAt(j)) {
					owel=owel+s.charAt(i);
					//j++;
				}
			}
		}
		System.out.println(owel);
	}
}
