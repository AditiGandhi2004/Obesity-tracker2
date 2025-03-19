
package edu.gatech.obesitytracker.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name="Nutrient")
public class Nutrient {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "nutrientId")
    private Long nutrientId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "value", nullable = false)
    private Double value;

    @Column(name = "units", nullable = false)
    private String units;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "foodEntryId")
    @JsonIgnore
    private FoodEntry foodEntry;

    public long getNutrientId() {
        return nutrientId;
    }

    public void setNutrientId(long nutrientId) {
        this.nutrientId = nutrientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public FoodEntry getFoodEntry() {
        return foodEntry;
    }

    public void setFoodEntry(FoodEntry foodEntry) {
        this.foodEntry = foodEntry;
    }

}
