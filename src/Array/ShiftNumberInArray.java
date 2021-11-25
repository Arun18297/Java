package Array;

public class ShiftNumberInArray {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};

		int key=5;
		for(int i=0;i<key;i++) {
			int temp=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
			for(int j=0;j<a.length;j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println('\n');
			
		}
	}
	}
