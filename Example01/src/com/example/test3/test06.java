package com.example.test3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "Wed 10:00-11:00"
				+ "\nFri 05:00-10:00"
				+ "\nWed 12:00-13:00"
				+ "\nMon 11:00-05:00"
				//+ "\nSat 00:00-00:20"
				+ "\nThu 05:00-10:00"
				;
		int i = new Solution06().solution(S) ;
		System.out.println("max of free time :" +i);
	}

}
class Solution06{
	public static Map<String, Integer> dayOfWeek = new LinkedHashMap<String, Integer>() ;
	static {
		dayOfWeek.put("Mon", 0*24*60) ;
		dayOfWeek.put("Tue", 1*24*60) ;
		dayOfWeek.put("Wed", 2*24*60) ;
		dayOfWeek.put("Thu", 3*24*60) ;
		dayOfWeek.put("Fri", 4*24*60) ;
		dayOfWeek.put("Sat", 5*24*60) ;
		dayOfWeek.put("Sun", 6*24*60) ;
		System.out.println("dayOfWeek :"+dayOfWeek);
	}
	public int solution(String S) {
		
		Map<Integer , Integer> meetingtime = new TreeMap<Integer , Integer>() ;
		
		String[] a =  S.split("[\n]") ;
		System.out.println("total of meeting : "+a.length);
		for (String str : a) {
			System.out.println("meeting :"+str);
			String[] meeting = str.split("[ -]") ;
			//System.out.println("meeting :"+meeting[0] );
			int i =  dayOfWeek.get(meeting[0].trim()) ;
			meetingtime.put(i+textToTime(meeting[1]), i+textToTime(meeting[2])) ;		
		}
		System.out.println("meeting time :"+meetingtime);
		List<Integer> sortedKeys=new ArrayList<Integer>(meetingtime.keySet());
		Collections.sort(sortedKeys);
		int startFreeTime = 0 ;
		int maxFreeTime = 0 ;
		for (Integer currentTime : sortedKeys) {
			int different = currentTime - startFreeTime ;
			if (maxFreeTime < different ) {
				maxFreeTime =  different  ;
				System.out.print("update max free time this case ==>");
			}
			System.out.print("Free Time Start:"+startFreeTime +" end : "+currentTime +"  " );
			System.out.print("this free Time :"+ different );
			System.out.println("   maxFreeTime :"+maxFreeTime);
			startFreeTime = meetingtime.get(currentTime) ;
			
		}
		int lastminute = 7*24*60 ; // 1 week
		int different =  lastminute - startFreeTime ;
		if (maxFreeTime < different ) {
			maxFreeTime =  different ;
			System.out.println("Case Last week");
		}
		System.out.print("Free Time Start:"+startFreeTime +"end :"+lastminute +"  " );
		System.out.print("this free Time :"+ different );
		System.out.println("   maxFreeTime :"+maxFreeTime);
		return maxFreeTime ;
	}
	private int textToTime(String time ) {
		return Integer.valueOf(time.split(":")[0])*24 + Integer.valueOf(time.split(":")[1]) ;
		
	}
}
