package myoackage;

public class InsertionofArray {

	public static void main(String[] args) {
		int a[]=new int[10];
		int n=6;
		a[0]=4;
		a[1]=8;
		a[2]=29;
		a[3]=9;
		a[4]=5;
		a[5]=87;
		int x=1;
		int b=5;
		int i;
		for( i=n;i>x;i--) {
		
		a[i]=a[i-1];
		//a6-a5
			//a5-a4
			//a4-a3
			//a3-a2
			//a3-a2
			
			//a[x]=b;
			
	//System.out.print(a[i]+" " );
		}
		
		a[x]=15;
		for( i=0;i<n+1;i++) {
			
		//a[index]=15;
			System.out.print(a[i]+" " );
		//System.out.println(a[i] );
		
		}
	}

}
