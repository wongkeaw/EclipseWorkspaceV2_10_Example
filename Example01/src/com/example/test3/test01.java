package com.example.test3;

import java.util.LinkedList;
import java.util.List;

public class test01 {

	public test01() {
		// TODO Auto-generated constructor stub
		
	}
	public static void main(String[] args) {
		
		Solution sol = new Solution() ;
		String msg = " i   123456789012    SMS messages    are really ongart woongekeov naja sho 123456789012 1234567890 2" ;
		
		//String msg = " 12345678 012" ;
		int numberMessage = sol.solution(msg, 12) ;
        //System.out.println(sol.pl);	
        System.out.println("numberMessage  :"+numberMessage );
	}
	

}
class Solution {
	   
		private List<String> pl = new LinkedList<String>() ;
		private String msg ;
		private int fix , index ;
		private boolean outOfLength = false ;
	   
		public int solution(String S, int K) {
			msg = S ;
			fix = K ;
			System.out.println(" text :"+msg);
			System.out.println(" max length of Message : "+fix);
			solution();
			System.out.println("list of Message : " + pl);
		   	return outOfLength ? -1 : pl.size() ;
		}
		private void  solution() {
			msg = msg.trim() ;
			if (msg.length() == 0 ) return ;
			//System.out.println("msg :"+msg);
			index = msg.lastIndexOf(" ",fix ) ;
			if (msg.length() <= fix) index = msg.length()  ;  // case message length < fix size
			//System.out.println(" index "+index);
			if (index == -1) index = msg.length() ;
			if (index > fix ) outOfLength = true ;
			pl.add(msg.substring(0, index)) ;
			msg = msg.substring(index) ;
			//System.out.println(pl);
			//System.out.println("message text :"+msg);
			solution(); 
		}
	}
