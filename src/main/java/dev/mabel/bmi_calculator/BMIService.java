package dev.mabel.bmi_calculator;

public class BMIService {
    public double calculateBMI(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

}
