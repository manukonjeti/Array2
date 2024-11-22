package myoackage;

import java.lang.reflect.Array;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {22,22,32,231,12,34,12,19};
int b=a.length;
int c[]= new int[b];
System.out.println(b);
//int j=0;
for(int i=b-1,j=0;i>=0;j++,i--) {
	
	//a0=a7
	//a1=a6 a2-a5 a3-a4 a4-a3 a5-a2 a6-a1 a7-a0
	
	System.out.println(a[i]+" ");
	c[j]=a[i];
	
	
}

for(int j: c) {
	System.out.print(j+" ");
}
	
	}
	
}
