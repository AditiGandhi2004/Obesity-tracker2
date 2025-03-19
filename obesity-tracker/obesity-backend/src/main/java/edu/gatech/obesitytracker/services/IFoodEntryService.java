package edu.gatech.obesitytracker.services;

import edu.gatech.obesitytracker.entities.FoodEntry;
import edu.gatech.obesitytracker.entities.User;
import edu.gatech.obesitytracker.web.dto.FoodEntryDto;
import edu.gatech.obesitytracker.web.dto.HistorySearchDto;

import java.util.List;

public interface IFoodEntryService {
    void addFoodEntry(User user, FoodEntryDto req) throws Exception;

    List<FoodEntry> getFoodEntriesByUser(User user) throws Exception;

    List<FoodEntry> getFoodEntryByFoodName(User user, String foodName) throws Exception;

    FoodEntry getFoodEntryById(User user, long foodEntryId) throws Exception;

    void deleteFoodEntryById(User user, long id) throws Exception;

    List<FoodEntry> getFoodEntryByDateRange(User user, HistorySearchDto req, Boolean unifyUnits) throws Exception;
}
