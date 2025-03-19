package edu.gatech.obesitytracker.repos;

import edu.gatech.obesitytracker.entities.Nutrient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutrientRepository extends JpaRepository<Nutrient, Integer> {
}
