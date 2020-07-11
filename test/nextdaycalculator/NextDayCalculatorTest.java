package nextdaycalculator;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    static int[] arrayExpectedDMY = new int[3];

    void setExpectedDayMonthYear(int expectedDay, int expectedMonth, int expectedYear) {
        arrayExpectedDMY[0] = expectedDay;
        arrayExpectedDMY[1] = expectedMonth;
        arrayExpectedDMY[2] = expectedYear;

    }
    @Test
    void testGetDayMonthYear1() {
        NextDayCalculator.getNextDay(1, 1, 2018);
        setExpectedDayMonthYear(2, 1, 2018);

        String result = Arrays.toString(NextDayCalculator.arrayNextDMY);
        String expectedDate = Arrays.toString(arrayExpectedDMY);

        assertEquals(expectedDate, result);
    }


    @Test
    void testGetDayMonthYear2() {
        NextDayCalculator.getNextDay(31, 1, 2018);
        setExpectedDayMonthYear(1, 2, 2018);

        String result = Arrays.toString(NextDayCalculator.arrayNextDMY);
        String expectedDate = Arrays.toString(arrayExpectedDMY);

        assertEquals(expectedDate, result);
    }

    @Test
    void testGetDayMonthYear3() {
        NextDayCalculator.getNextDay(30, 4, 2018);
        setExpectedDayMonthYear(1, 5, 2018);

        String result = Arrays.toString(NextDayCalculator.arrayNextDMY);
        String expectedDate = Arrays.toString(arrayExpectedDMY);

        assertEquals(expectedDate, result);
    }

    @Test
    void testGetDayMonthYear4() {
        NextDayCalculator.getNextDay(28, 2, 2018);
        setExpectedDayMonthYear(1, 3, 2018);

        String result = Arrays.toString(NextDayCalculator.arrayNextDMY);
        String expectedDate = Arrays.toString(arrayExpectedDMY);

        assertEquals(expectedDate, result);
    }

    @Test
    void testGetDayMonthYear5() {
        NextDayCalculator.getNextDay(29, 2, 2018);
        setExpectedDayMonthYear(1, 3, 2018);

        String result = Arrays.toString(NextDayCalculator.arrayNextDMY);
        String expectedDate = Arrays.toString(arrayExpectedDMY);

        assertEquals(expectedDate, result);
    }

    @Test
    void testGetDayMonthYear6() {
        NextDayCalculator.getNextDay(31, 12, 2018);
        setExpectedDayMonthYear(1, 1, 2019);

        String result = Arrays.toString(NextDayCalculator.arrayNextDMY);
        String expectedDate = Arrays.toString(arrayExpectedDMY);

        assertEquals(expectedDate, result);
    }
}

