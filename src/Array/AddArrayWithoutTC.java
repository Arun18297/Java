package Array;

public class AddArrayWithoutTC {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]= {9,8,7,6,45,67,4,56,44,4};
		int adds = 0;
		int count=a.length;
		if(count<b.length) {
			count=b.length;
		}

		for(int i=0;i<count;i++) {
			
			if(a.length>b.length) {
				adds=a[i]+b[i];
			}
				else if(a.length<b.length) {
					adds=a[i]+b[i];
				}
			System.out.println(adds);
			}
		
			
		}
	}
	