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
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            bmiService.calculateBMI(70, 0);
        bmiService.calculateBMI(70, 0);
        });
        assertThat(exception.getMessage(), containsString("Height must be positive"));
    }

    @Test
    @DisplayName("Should return zero when weight is zero")
    void testCalculateBMI_ZeroWeight_ShouldReturnZero() {
        BMIService bmiService = new BMIService();
        double bmi = bmiService.calculateBMI(0, 1.75);
        assertThat(bmi, is(0.0));
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
        assertThat(exception.getMessage(), containsString("Weight cannot be negative"));
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

    @Test
    @DisplayName("Should classify BMI")
    void testClassifyBMI() {
    BMIService bmiService = new BMIService();
    assertThat(bmiService.classifyBMI(15), is("Severe thinness"));
    assertThat(bmiService.classifyBMI(16.5), is("Moderate thinness"));
    assertThat(bmiService.classifyBMI(17.8), is("Mild thinness"));
    assertThat(bmiService.classifyBMI(22), is("Normal weight"));
    assertThat(bmiService.classifyBMI(27), is("Overweight"));
    assertThat(bmiService.classifyBMI(32), is("Mild obesity"));
    assertThat(bmiService.classifyBMI(37), is("Moderate obesity"));
    assertThat(bmiService.classifyBMI(42), is("Morbid obesity"));
}
}
