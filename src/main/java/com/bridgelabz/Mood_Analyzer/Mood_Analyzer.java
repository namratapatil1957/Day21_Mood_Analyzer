package com.bridgelabz.Mood_Analyzer;

public class Mood_Analyzer {
	
	String string;

	public Mood_Analyzer(String string) {
		this.string = string;
	}

	public Mood_Analyzer() {
		
	}

	public void analyseMood() {
		
		if (string.contains("happy")) {
			
			System.out.println(" Happy Mood ");
			
		}
		else {
			
			System.out.println(" Sad Mood ");
		
		}
	}
	
	public static void main(String[] args) {
		
		Mood_Analyzer ma = new Mood_Analyzer(" I am in happy mood ");
		
		ma.analyseMood();
		
	}
}
