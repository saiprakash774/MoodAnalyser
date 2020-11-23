package com.moodanalyser.test;
import org.junit.Assert;
import org.junit.Test;
import com.moodanalyser.main.MoodAnalyser;

public class TestMoodAnalyser {
	
	@Test
	public void givenMessage_WhenValid_ThenReturnMood() {
		MoodAnalyser mood = new MoodAnalyser("I am in sad mood");
		String result = mood.moodAnalyser("sad");
		Assert.assertEquals("sad", result);
	}

	@Test
	public void givenMessage_WhenNotValid_ThenReturnMood() {
		MoodAnalyser mood = new MoodAnalyser("I am in any mood");
		String result = mood.moodAnalyser("happy");
		Assert.assertEquals("happy", result);
	}

}
