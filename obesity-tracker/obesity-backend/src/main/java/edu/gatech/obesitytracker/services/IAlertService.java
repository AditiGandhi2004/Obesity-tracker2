package edu.gatech.obesitytracker.services;

import edu.gatech.obesitytracker.entities.Alert;
import edu.gatech.obesitytracker.entities.User;
import edu.gatech.obesitytracker.web.dto.AlertDto;
import edu.gatech.obesitytracker.web.dto.AlertStateDto;

import java.util.List;

public interface IAlertService {
    List<Alert> getAllAlertsByUser(User user) throws Exception;

    Alert getAlertById(User user, long alertId) throws Exception;

    Alert addAlert(User user, AlertDto req) throws Exception;

    void deleteAlertById(User user, long alertId) throws Exception;
    
    List<AlertStateDto> getAlertStatesByUser(User user) throws Exception;

    void updateAlert(User user, long alertId, AlertDto req) throws Exception;
}
