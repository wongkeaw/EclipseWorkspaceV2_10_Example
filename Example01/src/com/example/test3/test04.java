package com.example.test3;

public class test04 {

	public test04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "We test coders . Give use a try?ongart woongkew at gmail . is goo locck" ;
		int l = new sulution04().sulution(S) ;
		System.out.println("max sentence is :"+l);
	}
	

}
class sulution04{
	//O(n)
	public int sulution(String S) {
		String[] ls = S.split("[.?!]") ;
		int maxl = 0 ;
		System.out.println("total of sentence : "+ls.length);
		for (String str : ls) {
			System.out.print("this is sentence : "+ str.trim());
			int len = (str.trim().split(" ")).length ;
			System.out.println(" , length of sentence : "+len);
			if (len > maxl ) maxl = len ;
			//System.out.println(len);
		}
		return maxl ;
	}
}
