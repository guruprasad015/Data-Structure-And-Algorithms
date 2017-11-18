package com.guru.java8;

import java.util.*;

class Interval {
	 int start;
	 int end;
	 Interval() { start = 0; end = 0; }
	 Interval(int s, int e) { start = s; end = e; }
}

public class Java8Tester {

	public static List<Interval> merge(List<Interval> intervals) {
		
		/*Collections.sort(intervals, new Comparator<Interval>(){
			public int compare(Interval x, Interval y){
				return Integer.compare(x.start, y.start);
			}
			
		});*/
		
		
		List<Interval> res = new ArrayList<>();
        int size = intervals.size();
        
        if(size == 0)
            return res;
        
        Collections.sort(intervals, (x,y) -> Integer.compare(x.start, y.start));
        
        for (Interval i : intervals)
			System.out.println(i.start + "," + i.end);
		
		Interval current = null;
		
		int intervalStart = intervals.get(0).start;
        int intervalEnd = intervals.get(0).end;
		
		for(int i=1; i<size; i++){
			current = intervals.get(i);
			
			if(current.start > intervalEnd){
				Interval merged = new Interval(intervalStart,intervalEnd);
				res.add(merged);
				intervalStart = current.start; 
			}
            intervalEnd = Math.max(intervalEnd, current.end);   
		}
        
		Interval merged = new Interval(intervalStart,intervalEnd);
		res.add(merged);
		
		System.out.println("-------");
		for (Interval i : res)
			System.out.println(i.start + "," + i.end);
		return res;
        
    }

	public static void main(String[] args) {
		Interval i1 = new Interval(2,3);
		Interval i2 = new Interval(4,5);
		Interval i3 = new Interval(6,7);
		Interval i4 = new Interval(8,9);
		Interval i5 = new Interval(1,10);
		
		List<Interval> input = Arrays.asList(i1,i2,i3,i4,i5);
		
		List<Interval> res = merge(input);

	}

}
