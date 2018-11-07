package com.example.test3;

import java.util.HashSet;
import java.util.Set;

public class test03 {

	public test03() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "John aa Doe;John bbb Doe;John cc Doe;John dd Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker" ;
		String C = "Example"  ;
		System.out.println("Original Name :"+S);
		sulution3 sol = new sulution3() ;
		String msg = sol.solution(S, C) ;
		System.out.println("Modify Name :"+msg);
	}
	

}
class sulution3 {
	public String solution(String S, String C) {
		Set<String> nameList = new HashSet<String>() ;
		StringBuilder returnValue = new StringBuilder() ;
		for (String obj : S.split(";") ) {
			System.out.print("full name :"+obj );
			String a = obj.substring(0,obj.trim().indexOf(" ")).trim() ;
			String b = obj.substring(obj.trim().lastIndexOf(" ")+1).trim() ;
			String name = new StringBuffer(a).append(".").append(b).toString() ;
			int running = 1 ;
			String oName = name ;
			while (nameList.contains(name) ) {
				name = oName +(++running) ;
			}
			nameList.add(name) ;
			StringBuilder sb = new StringBuilder() ;
			sb.append(obj).append("<").append(name).append("@").append(C).append(".com>;") ;
			System.out.println(" , Modify Name :"+sb );
			returnValue.append(sb) ;
		}
		return returnValue.toString() ;
	}
}
