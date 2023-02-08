package com.jonathan.springdemo;

public class FootBallCoach implements Coach{
	@Override	
	public String getDailyWorkout() {
		return "You must score two goals";
	}
}
