package myoackage;

public class copyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int 	a[]= {1,22,12,13,24,13};
	
	int x=a.length;
	int b[]=new int[x];
	
	for(int i=0; i<a.length;i++) {
		//a[i]=b[i];
		b[i]=a[i];
		//System.out.println(b[i]);
		
	}
	for(int i:b) {
		
	System.out.print(i+" ");	
	}
	//System.out.println(b[i]);
	
				}

}
