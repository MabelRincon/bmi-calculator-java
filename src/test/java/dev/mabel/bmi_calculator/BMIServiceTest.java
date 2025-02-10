package dev.mabel.bmi_calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BMIServiceTest {

    @Test
    @DisplayName("Should calculate BMI")
    void testCalculateBMI() {
        BMIService bmiService = new BMIService();
        double bmi = bmiService.calculateBMI(70, 1.75);
        assertThat(bmi, closeTo(22.86, 0.01));

    }
}
