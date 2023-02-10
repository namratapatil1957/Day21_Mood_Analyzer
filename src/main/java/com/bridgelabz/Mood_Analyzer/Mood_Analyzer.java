package com.bridgelabz.Mood_Analyzer;

public class Mood_Analyzer {
	
	String string;
	String happy;
	
	public Mood_Analyzer(String string) {
		this.string = string;
	}

	public Mood_Analyzer() {
		
	}

	public void analyseMood(String string) {
		
		try {
			
			if (string == "") {
				throw new MoodAnalysicException(" NULL_MOOD ", MoodAnalysicException.eType.NULL_MOOD);
			}
		
			if (string.contains("happy")) {
			
				System.out.println(" Happy Mood ");
			
			}
			else {
			
				System.out.println(" Sad Mood ");
		
			}
			
		}catch (MoodAnalysicException me) {
			System.out.println(me.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		
		Mood_Analyzer ma = new Mood_Analyzer();
		
		ma.analyseMood("");
		
	}
}
