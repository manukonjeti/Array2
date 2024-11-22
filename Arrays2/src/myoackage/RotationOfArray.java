package myoackage;

public class RotationOfArray {
// left rotation of array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,23,4,42,54,45,32,34};
		int temp =a[0];
		//System.out.println(a.length);
		for(int i=1;i<a.length;i++) {
			a[i-1]=a[i];
			a[a.length-1]=temp;
			System.out.print(a[i]+" ");
		}
		//System.out.print(a[i]);

		
		

	}
	
	
	//System.out.print(a[i]);

}
