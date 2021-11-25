package StringPgms;

public class Seperation {
	public static void main(String[] args) {
		String s="a123hjh&^l0-7";
		String alpha="";
		String num="";
		String sp="";
		for(int i=0;i<s.length();i++){
			//if((s.charAt(i)>=65 && s.charAt(i)<=90)||(s.charAt(i)>=97 && s.charAt(i)<=122)){//ascii values
			if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z')){
				alpha=alpha+s.charAt(i);
			}
			//else if(s.charAt(i)>=48 && s.charAt(i)<=57){
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				num=num+s.charAt(i);
			}
			else{
				sp=sp+s.charAt(i);
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(sp);
	}
}
