package com.company;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConverterSwitchTest {
    private ConverterSwitch converterSwitch;
    int dayOfWeek;
    int monthOfYear;

    @Before
    public void setup() {
        converterSwitch = new ConverterSwitch();
        dayOfWeek = 3;
        monthOfYear = 4;
    }


    @Test
    public void shouldTakeIntegerBetween1And12AndReturnMonth() {
        // Arrange
        String day3 = "Tuesday";
        String month4 = "April";

        // Act
        String dayOutput = converterSwitch.convertDay(dayOfWeek);
        String monthOutput = converterSwitch.convertMonth(monthOfYear);

        // Assert

        assertEquals(day3, dayOutput);
        assertEquals(month4, monthOutput);

    }
 @Test
    public void shouldTakeIntegerBetween1and7AndReturnDayOfWeek() {
        // Arrange
        String day3 = "Tuesday";
        String month4 = "April";

        // Act
        String dayOutput = converterSwitch.convertDay(dayOfWeek);
        String monthOutput = converterSwitch.convertMonth(monthOfYear);

        // Assert

        assertEquals(day3, dayOutput);
        assertEquals(month4, monthOutput);

    }
}
