package com.example.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test05 {

	public test05() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {1,10,2,3,4,6,7,8,9,10} ;
		int b = new sulution05().sulutionx(i);
		System.out.println(b);
	}

}
class sulution05{
	// O(n)
	int focust = -1 ;
	int count = -1 ;
	public int sulution(int[] i) {
		int[] ints = i.clone() ;
		while(focust == -1) {
			sulutionx(i) ;
		};
		return focust ;
	}
	public int sulutionx(int[] i) {
		int[] ints = i.clone() ;
		
		@SuppressWarnings("serial")
		List<Integer> ai = Arrays.stream(ints).boxed().collect(Collectors.toList());
		ai.sort(Comparator.naturalOrder());
		int x = 0 ;
		for (int j = 0; j < i.length; j++) {
			System.out.println("index at: "+j+" Original value : "+i[j]  +" Order by Value : "+ai.get(j));
			if (  i[j] != ai.get(j) && ++x > 2  ) {
				return 0 ;
			};
		}
		System.out.println(focust);
		return i.length ;
	}
}