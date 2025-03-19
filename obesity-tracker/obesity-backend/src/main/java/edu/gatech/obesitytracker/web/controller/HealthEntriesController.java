package edu.gatech.obesitytracker.web.controller;

import edu.gatech.obesitytracker.entities.User;
import edu.gatech.obesitytracker.sec.AuthenticatedUser;
import edu.gatech.obesitytracker.services.IFHIRService;

import java.util.Date;
import java.util.List;

import edu.gatech.obesitytracker.web.dto.HealthEntryDto;
import edu.gatech.obesitytracker.commons.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HealthEntriesController {

    private final IFHIRService fhirService;

    @Autowired
    public HealthEntriesController(IFHIRService fhirService) {
        this.fhirService = fhirService;
    }

    @GetMapping(value = "/health-entries", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<HealthEntryDto>> getFHIRData(@AuthenticatedUser User user) throws Exception {
        List<HealthEntryDto> patientHealthData = fhirService.getPatientHealthData(user);
        return new ResponseEntity<>(patientHealthData, HttpStatus.OK);
    }

    @PostMapping(value = "/health-entries", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<HealthEntryDto> addFHIRData(@AuthenticatedUser User user,
                                                  @RequestBody HealthEntryDto req) throws Exception {

        fhirService.addPatientHealthData(user, req);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @GetMapping(value = "/health-entries", params = { "startDate", "endDate" }, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<HealthEntryDto>> getFHIRDataByDateRange(@AuthenticatedUser User user,
    		@DateTimeFormat(pattern= CommonUtil.ISODateFormat) Date startDate,
    		@DateTimeFormat(pattern= CommonUtil.ISODateFormat) Date endDate) throws Exception {

        List<HealthEntryDto> resp = fhirService.getPatientHealthDataByDateRange(user, startDate, endDate);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/health-entries", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity deleteFHIRData(@AuthenticatedUser User user) throws Exception {
        fhirService.deletePatientHealthData(user);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(value = "/health-entries/{healthEntryId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity deleteFHIRData(@AuthenticatedUser User user,
                                         @PathVariable("healthEntryId") String id) throws Exception {
        fhirService.deletePatientHealthDataById(user, id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
