package edu.gatech.obesitytracker.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.gatech.obesitytracker.entities.Goal;
import edu.gatech.obesitytracker.entities.User;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Long>{
	
	List<Goal> findByUser(User user);
	
	Goal findByUserAndGoalId(User user, long goalId);

	List<Goal> findByUserAndDate(User user, Date date);

	void deleteByUserAndGoalId(User user, long goalId);

	Goal getOneByUserAndGoalId(User user, long goalId);
}
