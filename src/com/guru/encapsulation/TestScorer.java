package com.guru.encapsulation;

public class TestScorer {

	public static void main(String[] args) {
		
		CricketScorer scorer = new CricketScorer();
		
		scorer.setScore(4);
		
		System.out.println("Current Score : " + scorer.getScore());

	}

}
