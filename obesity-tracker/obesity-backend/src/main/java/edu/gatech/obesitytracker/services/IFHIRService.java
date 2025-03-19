package edu.gatech.obesitytracker.services;

import java.util.Date;
import java.util.List;

import edu.gatech.obesitytracker.entities.User;
import edu.gatech.obesitytracker.web.dto.HealthEntryDto;

public interface IFHIRService {

	void addPatientHealthData(User user, HealthEntryDto req) throws Exception;
	
	void deletePatientHealthData(User user) throws Exception;

	void deletePatientHealthDataById(User user, String id) throws Exception;
	
	List<HealthEntryDto> getPatientHealthData(User user) throws Exception;
	
	List<HealthEntryDto> getPatientHealthDataByDateRange(User user, Date startDate, Date endDate) throws Exception;

}
