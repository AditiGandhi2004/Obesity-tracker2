package edu.gatech.obesitytracker.web.dto;

import edu.gatech.obesitytracker.entities.Goal;
import edu.gatech.obesitytracker.entities.GoalState;

public class GoalStateDto {
	private Goal goal;
	private GoalState state;
	private Double currentValue;
	
	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	public GoalState getState() {
		return state;
	}

	public void setState(GoalState state) {
		this.state = state;
	}

	public Double getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(Double currentValue) {
		this.currentValue = currentValue;
	}
}
