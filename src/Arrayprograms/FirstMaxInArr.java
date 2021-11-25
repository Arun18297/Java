package Arrayprograms;

public class FirstMaxInArr {
   
	public static void main(String[] args) {
		int[] x= {50,90,20,10,60};
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]<x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println("First maximum element is "+x[0]);
	}
}
