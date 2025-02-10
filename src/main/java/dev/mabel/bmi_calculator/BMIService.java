package dev.mabel.bmi_calculator;

public class BMIService {
    public double calculateBMI(double weight, double height) {

        if (height <= 0 && weight <= 0) {
            throw new IllegalArgumentException("Weight and Height must be positive");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        /* }
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive"); */
        }
        if (weight < 0 ) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        return weight / Math.pow(height, 2);
    }

}
