package com.bridgelabz.Mood_Analyzer;

public class MoodAnalysicException extends Exception{

	enum eType{
		
		EMPTY_MOOD, NULL_MOOD
	}
	
	eType type;
    
	public MoodAnalysicException(String msg , eType type) {
		
		super(msg);
		this.type = type;
	
	}
}
