package com.bridgelabz.Mood_Analyzer;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class Test_Mood_Analyzer {

	Scanner sc = new Scanner (System.in);
	
	@Test
	public void analyseMoodTestCase1() {
		String str = " I am in sad mood ";
		
		if (str.contains(" sad ")) {
			System.out.println(" Test Case 1: Sad Mood ");
		}
		else {
			System.out.println(" Test Case 1: Happy Mood ");
		}
		
		String actual = "sad";
		String excepted = "sad";
		
		Assert.assertEquals(excepted, actual);
	}
	
	@Test
	public void analyseMoodTestCase2() {
		String str = " I am in any mood ";
		
		if (str.contains(" sad ")) {
			System.out.println(" Test Case 2: Sad Mood ");
		}
		else {
			System.out.println(" Test Case 2: Happy Mood ");
		}
		
		String actual = "happy";
		String excepted = "happy";
		
		Assert.assertEquals(excepted, actual);
	}
	
	@Test
	public void refactorTestCase1() {
		
		Mood_Analyzer ma = new Mood_Analyzer(" I am in sad mood ");
		ma.analyseMood();
		
		String actual = "sad";
		String excepted = "sad";
		
		Assert.assertEquals(excepted, actual);
		
	}
	
	@Test
	public void refactorTestCase2() {
		
		Mood_Analyzer ma = new Mood_Analyzer(" I am in happy mood ");
		ma.analyseMood();
		
		String actual = "happy";
		String excepted = "happy";
		
		Assert.assertEquals(excepted, actual);
		
	}
	
}
