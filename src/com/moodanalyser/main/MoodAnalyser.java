package com.moodanalyser.main;

public class MoodAnalyser {
	private String message;

	public String moodAnalyser(String mood) {
		if (message.contains("sad"))
			return ("sad");
		else if (message.contains("Any"))
			return ("happy");
		return (mood);
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}
}
