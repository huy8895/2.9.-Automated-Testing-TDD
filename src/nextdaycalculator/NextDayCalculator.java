package nextdaycalculator;

import java.util.Arrays;

public class NextDayCalculator {
    private static int dayOfMonth;
    private static final int[] monthOfPrimeYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] monthOfNormalYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int[] arrayNextDMY;

    public static void getNextDay(int day, int month, int year) {
        setDayOfMonth(year, month);
        if (isLastMonth(month) && isLastDay(day)) {
            arrayNextDMY = new int[]{1, 1, (year + 1)};
        } else if (isLastDay(day)) {
            arrayNextDMY = new int[]{1, month + 1, year};
        } else {
            arrayNextDMY = new int[]{day + 1, month, year};
        }

    }

    public static int getDayOfMonth() {
        return dayOfMonth;
    }

    public static void setDayOfMonth(int dayOfMonth) {
        NextDayCalculator.dayOfMonth = dayOfMonth;
    }

    public static boolean isLastDay(int day) {
        return day == dayOfMonth;
    }

    public static boolean isLastMonth(int month) {
        return month == 12;
    }


    public static void setDayOfMonth(int year, int month) {
        if (isLeapYear(year)) {
            dayOfMonth = monthOfPrimeYear[month - 1];
        } else
            dayOfMonth = monthOfNormalYear[month - 1];
    }


    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

}

