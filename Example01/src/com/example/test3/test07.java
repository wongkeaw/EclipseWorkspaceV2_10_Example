package com.example.test3;

import java.text.DecimalFormat;

public class test07 {

	public test07() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "00-44 48  5555 8361" ;
		String result = new sulution07().sulution(S) ;
		System.out.println("Result : "+result );
	}

}
class sulution07{
	// O(n)
	public String sulution(String S) {
		if (S == null ) return null ;
		String str = S.replaceAll("[^0-9]", "") ;
		System.out.println(str);
		StringBuilder strb2 = new StringBuilder("") ;
		while(true) {
			System.out.println(str.length());
			if (str.length() < 4) {
				strb2.append(str) ;
				str = "" ;
				break ;
			} else if (str.length() == 4) {
				String a = str.substring(0, 2) ;
				str = str.substring( 2) ;
				strb2.append(a).append("-") ;
				
			}else {
				String a = str.substring(0, 3) ;
				strb2.append(a).append("-") ;
				str = str.substring( 3) ;
				
			}
		}
		
		return strb2.toString() ;
	}
}
