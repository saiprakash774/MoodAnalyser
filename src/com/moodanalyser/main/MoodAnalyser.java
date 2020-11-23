package com.moodanalyser.main;

public class MoodAnalyser {
	private String message;

	public String moodAnalyser(String mood) throws MoodAnalysisException {
		try {
			if(message.length()==0) 
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Enter a proper message");
			if (message.contains("sad"))
				return ("sad");
			else if (message.contains("Any"))
				return ("happy");

		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Enter a proper message");
		}
		return (mood);
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}
}
