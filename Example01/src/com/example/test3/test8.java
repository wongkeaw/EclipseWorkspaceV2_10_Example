package com.example.test3;

public class test8 {

	public test8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] S = {1,2,3,4} ;
		int result = new sulution08().sulution(S) ;
		System.out.println("Result : "+result );
	}

}
class sulution08{
	// O(n)
	public int sulution(int[] a) {
		int hp = 0 ;
		int hv = 0 ;
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			if (j > hv ) {
				hp = i ;
				hv = a[i] ;
			}
			
		}
		System.out.println(hp);
		System.out.println(hv);
		return 0 ;
	}
}
