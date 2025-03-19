package edu.gatech.obesitytracker.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class NutrientsResponse {
    @SerializedName("report")
    private Report report;

    public NutrientsResponse() {
    }

    public Report getReport() {
        return report;
    }

    public NutrientsResponse setReport(Report report) {
        this.report = report;
        return this;
    }

    public class Report {
        @SerializedName("food")
        private Food food;

        public Report() {
        }

        public Food getFood() {
            return food;
        }

        public Report setFood(Food food) {
            this.food = food;
            return this;
        }
    }

    public class Food {
        @SerializedName("nutrients")
        private ArrayList<Nutrient> nutrients;

        @SerializedName("name")
        private String name;

        public Food() {
        }

        public String getName() {
            return name;
        }

        public ArrayList<Nutrient> getNutrients() {
            return nutrients;
        }

        public Food setNutrients(ArrayList<Nutrient> nutrients) {
            this.nutrients = nutrients;
            return this;
        }

        public Food setName(String name) {
            this.name = name;
            return this;
        }
    }

    public class Nutrient {
        @SerializedName("nutrient_id")
        private String id;

        @SerializedName("name")
        private String name;

        @SerializedName("unit")
        private String unit;

        @SerializedName("value")
        private double value;

        @SerializedName("measures")
        private ArrayList<Measure> measures;

        public Nutrient() {
        }

        public String getId() {
            return id;
        }

        public String getUnit() {
            return unit;
        }

        public String getName() {
            return name;
        }

        public Nutrient setId(String id) {
            this.id = id;
            return this;
        }

        public double getValue() {
            return value;
        }

        public Nutrient setValue(double value) {
            this.value = value;
            return this;
        }

        public Nutrient setName(String name) {
            this.name = name;
            return this;
        }

        public Nutrient setUnit(String unit) {
            this.unit = unit;
            return this;
        }

        public ArrayList<Measure> getMeasures() {
            return measures;
        }

        public Nutrient setMeasures(ArrayList<Measure> measures) {
            this.measures = measures;
            return this;
        }
    }

    public class Measure {
        @SerializedName("eqv")
        private double servingQuantity;


        public Measure() {
        }

        public double getServingQuantity() {
            return servingQuantity;
        }

        public Measure setServingQuantity(double servingQuantity) {
            this.servingQuantity = servingQuantity;
            return this;
        }
    }
}
