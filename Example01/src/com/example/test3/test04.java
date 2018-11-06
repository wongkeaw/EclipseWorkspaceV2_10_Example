package com.example.test3;

public class test04 {

	public test04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "We test coders . Give use a try?" ;
		int l = new sulution04().sulution(S) ;
		System.out.println("max sentence is "+l);
	}
	

}
class sulution04{
	public int sulution(String S) {
		String[] ls = S.split("[.?!]") ;
		int maxl = 0 ;
		System.out.println(ls.length);
		for (String str : ls) {
			System.out.println(str.trim());
			int len = (str.trim().split(" ")).length ;
			if (len > maxl ) maxl = len ;
			//System.out.println(len);
		}
		return maxl ;
	}
}
