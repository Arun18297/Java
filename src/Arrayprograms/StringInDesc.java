package Arrayprograms;

import java.util.TreeSet;

public class StringInDesc {
  
	public static void main(String[] args) {
		String[] a = {"Java","Selenium","Manual","SQL"};
		  TreeSet<String> set=new TreeSet<String>();
		  for(int i=0;i<a.length;i++)
		  {
			  set.add(a[i]);
		  }
              System.out.println(set.descendingSet());
	}
}
