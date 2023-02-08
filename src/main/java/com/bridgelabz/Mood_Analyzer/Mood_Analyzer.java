package com.bridgelabz.Mood_Analyzer;

public class Mood_Analyzer {
	
	public void analyseMood(String str) {
		
		if (str.contains("happy")) {
			
			System.out.println(" Happy Mood ");
			
		}
		else {
			
			System.out.println(" Sad Mood ");
		
		}
	}
	
	public static void main(String[] args) {
		
		Mood_Analyzer ma = new Mood_Analyzer();
		ma.analyseMood("I am in happy mood ");
		ma.analyseMood("I am in sad mood ");
		
	}
}
