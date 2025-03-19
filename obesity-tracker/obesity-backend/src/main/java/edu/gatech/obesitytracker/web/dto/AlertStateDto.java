package edu.gatech.obesitytracker.web.dto;

import edu.gatech.obesitytracker.entities.Alert;
import edu.gatech.obesitytracker.entities.AlertState;

public class AlertStateDto {
	private Alert alert;
	private AlertState state;
	private Double currentValue;
	
	public Alert getAlert() {
		return alert;
	}
	public void setAlert(Alert alert) {
		this.alert = alert;
	}
	public AlertState getState() {
		return state;
	}
	public void setState(AlertState state) {
		this.state = state;
	}


	public Double getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(Double currentValue) {
		this.currentValue = currentValue;
	}
}
