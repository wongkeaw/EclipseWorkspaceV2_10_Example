package com.example.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class test02 {

	public test02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String S = "John aa Doe;John bb Doe;John Doe;John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker" ;
		String C = "Example"  ;
		System.out.println("Original Name :"+S);
		Solution2 sol = new Solution2() ;
		String msg = sol.solution(S, C) ;
		System.out.println("Modify Name :"+msg);
		
	}

}

class Solution2 { 
	public String solution(String S, String C) {
		// TODO Auto-generated method stub
		StringBuilder returnValue = new StringBuilder() ;
		StringTokenizer st = new StringTokenizer(S, ";") ;
		List<String> nameList = new ArrayList<String>() ;
		while (st.hasMoreElements()) {
			String obj = (String) st.nextElement();
			//System.out.println("full name :"+obj);
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
			sb.append(" <").append(name).append("@").append(C).append(".com>") ;
			//System.out.println(sb.toString());
			returnValue.append(obj).append(sb).append("; ") ;
		}
		//System.out.println(returnValue.toString());
		return returnValue.substring(0,returnValue.length() -1-1) ;
		//return returnValue.toString() ;
	}
}
