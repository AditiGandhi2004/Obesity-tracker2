package edu.gatech.obesitytracker.repos;

import edu.gatech.obesitytracker.entities.Alert;
import edu.gatech.obesitytracker.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long> {
    List<Alert> findAlertsByUser(User user);
    Alert findAlertByUserAndAlertId(User user, long alertId);

}
