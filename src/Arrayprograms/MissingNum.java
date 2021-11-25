package Arrayprograms;


import java.util.LinkedList;

public class MissingNum {
	public static void main(String[] args) {
		int n[]= {0,1,2,3,4,5,6,7,9,10};
		LinkedList<Integer> list=new LinkedList<>();
		for(int i=0;i<n.length;i++) {
			
		
			if(i==n[i]) {
				
				list.add(n[i]);
			}
			
			
			else {
				
				list.add(i);
				System.out.println(i);
				
			}
	
		}
		 if(n[n.length-1]==n.length) {
			
			list.add(n.length);
		 }
		System.out.println(list);
		}
	

}
