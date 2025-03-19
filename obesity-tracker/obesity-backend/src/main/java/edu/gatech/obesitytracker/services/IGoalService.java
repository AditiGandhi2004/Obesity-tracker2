package edu.gatech.obesitytracker.services;

import edu.gatech.obesitytracker.entities.Goal;
import edu.gatech.obesitytracker.entities.User;
import edu.gatech.obesitytracker.web.dto.GoalStateDto;

import java.util.Date;
import java.util.List;

public interface IGoalService {
    void addNewGoal(User user, Goal goal) throws Exception;

    List<Goal> getAllGoalsByUser(User user) throws Exception;

    Goal getGoalById(User user, long goalId) throws Exception;

    List<Goal> getGoalsByDate(User user, Date date) throws Exception;

    void deleteGoalById(User user, long goalId) throws Exception;
    
    List<GoalStateDto> getGoalStatesByUser(User user) throws Exception;

    void updateGoal(User user, long goalId, Goal goal) throws Exception;
}
