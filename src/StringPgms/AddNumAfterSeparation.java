package StringPgms;

public class AddNumAfterSeparation {
	public static void main(String[] args) {
		String s="a123hjh&^l0-7";
		int sum=0;
		for(int i=0;i<s.length();i++){

			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int n=s.charAt(i)-48;
				sum=sum+n;
				//num=" "+s.charAt(i);
			}
			//System.out.println(num);
		}
		System.out.println(sum);

	}
}