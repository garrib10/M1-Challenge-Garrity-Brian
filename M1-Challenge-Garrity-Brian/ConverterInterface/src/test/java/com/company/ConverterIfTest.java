package com.company;

import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class ConverterIfTest {
    private ConverterIf converterIf;
    int dayOfWeek;
    int monthOfYear;

    @Before
    public void setup() {
        converterIf = new ConverterIf();
        dayOfWeek = 3;
        monthOfYear = 4;
    }


    @Test
    public void shouldTakeIntegerBetween1And12AndReturnMonth() {
        // Arrange
        String day3 = "Tuesday";
        String month4 = "April";

        // Act
        String dayOutput = converterIf.convertDay(dayOfWeek);
        String monthOutput = converterIf.convertMonth(monthOfYear);

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
        String dayOutput = converterIf.convertDay(dayOfWeek);
        String monthOutput = converterIf.convertMonth(monthOfYear);

        // Assert

        assertEquals(day3, dayOutput);
        assertEquals(month4, monthOutput);

    }
}
