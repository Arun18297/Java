package Arrayprograms;

public class StringMaxLen {
    public static void main(String[] args) {
		String[] a = {"Java","Selenium","Manual","SQL"};
		int maxLength=0;
		for(int i=0;i<a.length;i++)
		{
			int length=a[i].length();
			if(maxLength<length)
			{
			   maxLength=length;	
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(maxLength==a[i].length())
			{
				System.out.println(a[i]);
			}
		}
	}
}
