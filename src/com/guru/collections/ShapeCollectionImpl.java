package com.guru.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeCollectionImpl {

	public static void main(String[] args) {
		Shapes circle = new Shapes("Circle1", "RED");
		Shapes triangle = new Shapes("Triangle", "RED");
		Shapes circle2 = new Shapes("Circle2", "RED");
		
		List<Shapes> myShapesCollection = new ArrayList<Shapes>();
		myShapesCollection.add(circle);
		myShapesCollection.add(triangle);
		myShapesCollection.add(circle2);
		
		myShapesCollection.stream()
		.filter(e -> e.getColor() == "RED")
		.forEach(e -> System.out.println(e.getName()));
		
		myShapesCollection.parallelStream()
		.filter(e -> e.getColor() == "RED")
		.forEach(e -> System.out.println(e.getName()));
		
		for(Shapes s : myShapesCollection){
			System.out.println(s.getName() + " : " + s.getColor());
		}
		
		Iterator<Shapes> sit = myShapesCollection.iterator();
		while(sit.hasNext()){
			Shapes temp = sit.next();
			System.out.println(temp.getName() + " : " + temp.getColor());
		}
		
			
	}

}
