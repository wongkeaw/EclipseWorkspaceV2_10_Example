/**
 * 
 */
package com.example.test3;

/**
 * @author ongOngongPC
 *
 */
public class Solution31 {

	/**
	 * 
	 */
	public Solution31() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	private static int[] DAY  = new int[30] ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create data
		for (int i = 0; i < DAY.length; i++) {
			DAY[i] = i+1 ;
			//System.out.println(DAY[i]);
			
		}
		int[] booking = {2,3 ,4,5,6 ,10 ,15} ;
		int cost = soluetion(booking) ;
		System.out.print("Cost == ");
		System.out.println(cost);
	}
	public static int soluetion(int[] A) {
		//int maxValue = A[A.length-1] ;
		//System.out.println(maxValue);
		cost30Day(A);
		return 0 ;
	}
	public static void cost30Day(int[] booking){
		int maxValue = booking[booking.length-1] ;
		int minValue = booking[0] ;
		System.out.println(minValue);
		System.out.println(maxValue);
	}
	
}
