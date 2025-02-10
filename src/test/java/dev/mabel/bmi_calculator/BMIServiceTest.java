package dev.mabel.bmi_calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class BMIServiceTest {

    @Test
    @DisplayName("Should calculate BMI")
    void testCalculateBMI() {
        BMIService bmiService = new BMIService();
        double bmi = bmiService.calculateBMI(70, 1.75);
        assertThat(bmi, closeTo(22.86, 0.01));
    }

    @Test
    @DisplayName("Should throw exception when height is zero")
    void testCalculateBMI_ZeroHeight_ShouldThrowException() {
        BMIService bmiService = new BMIService();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            bmiService.calculateBMI(70, 0);
        });
        assertThat(exception.getMessage(), containsString("/ by zero"));
    }

    @Test
    @DisplayName("Should return zero when weight is zero")
    void testCalculateBMI_ZeroWeight_ShouldReturnZero() {
        BMIService bmiService = new BMIService();
        double bmi = bmiService.calculateBMI(0, 1.75);
        assertThat(bmi, is(0.0));  // BMI = 0 / (1.75 * 1.75) = 0.0
    }

    @Test
    @DisplayName("Should throw exception when height is negative")
    void testCalculateBMI_NegativeHeight_ShouldThrowException() {
        BMIService bmiService = new BMIService();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            bmiService.calculateBMI(70, -1.75);
        });
        assertThat(exception.getMessage(), containsString("Height must be positive"));
    }

    @Test
    @DisplayName("Should throw exception when weight is negative")
    void testCalculateBMI_NegativeWeight_ShouldThrowException() {
        BMIService bmiService = new BMIService();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            bmiService.calculateBMI(-70, 1.75);
        });
        assertThat(exception.getMessage(), containsString("Weight must be positive"));
    }

    @Test
    @DisplayName("Should throw exception when weight and height are negative")
    void testCalculateBMI_NegativeWeightAndHeight_ShouldThrowException() {
        BMIService bmiService = new BMIService();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            bmiService.calculateBMI(-70, -1.75);
        });
        assertThat(exception.getMessage(), containsString("Weight and Height must be positive"));
    }
}
