package com.example.test3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test05 {

	public test05() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] i = {5,2,3,4,1,6 ,1} ;
		boolean b = new sulution05().sulution(i);
		System.out.println(b);
	}

}
class sulution05{
	// O(n)
	public boolean sulution(Integer[] i) {
		List<Integer> ai = Arrays.asList(i.clone());
		ai.sort(Comparator.naturalOrder());
		int x = 0 ;
		for (int j = 0; j < i.length; j++) {
			System.out.println("index at: "+j+" Original value "+i[j]  +" Order by Value :"+ai.get(j));
			if (  i[j] != ai.get(j) && ++x > 2 ) return false ;
		}
		
		return true ;
		//System.out.println(x);
		//return x <= 2 ? true : false ;
	}
}