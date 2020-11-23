package com.moodanalyser.test;
import org.junit.Assert;
import org.junit.Test;
import com.moodanalyser.main.MoodAnalyser;
import com.moodanalyser.main.MoodAnalysisException;

public class TestMoodAnalyser {
	
	@Test
	public void givenMessage_WhenValid_ThenReturnMood() {
		MoodAnalyser mood = new MoodAnalyser("I am in sad mood");
		try {
				String result = mood.moodAnalyser("sad");
				Assert.assertEquals("sad", result);
		}catch(MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMessage_WhenNotValid_ThenReturnMood() {
		MoodAnalyser mood = new MoodAnalyser("I am in any mood");
		try {
		String result = mood.moodAnalyser("happy");
		Assert.assertEquals("happy", result);
		}catch(MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void givenNullMood_ShouldReturnHappy() {
		MoodAnalyser mood = new MoodAnalyser(null);
		try {
		String result = mood.moodAnalyser("");
		Assert.assertEquals("happy", result);
	}catch(MoodAnalysisException e) {
		Assert.assertEquals("Enter a proper message", e.getMessage());
	}
}
	
	@Test
	public void givenEmpty_WhenEmpty_ThenShouldThrowException() throws MoodAnalysisException {

		MoodAnalyser mood = new MoodAnalyser("");
		try {
			String result = mood.moodAnalyser("");
			Assert.assertEquals("happy", result);

		} catch (MoodAnalysisException e) {
			Assert.assertEquals("Enter a proper message", e.getMessage());
		}
	}

}
