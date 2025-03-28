package edu.gatech.obesitytracker.repos;

import java.util.Date;
import java.util.List;

import edu.gatech.obesitytracker.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.gatech.obesitytracker.entities.FoodEntry;

@Repository
public interface FoodEntryRepository extends JpaRepository<FoodEntry, Long> {

    List<FoodEntry> findByUser(User user);

    List<FoodEntry> findByUserAndName(User user, String name);

    FoodEntry findOneByUserAndFoodEntryId(User user, long foodEntryId);
    
    List<FoodEntry> findByUserAndConsumptionDateBetween(User user, Date startDate, Date endDate);

    void deleteFoodEntryByUserAndFoodEntryId(User user, long foodEntryId);
}
