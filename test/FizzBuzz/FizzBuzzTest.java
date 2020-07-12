package FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz1() {
        int number = 6;
        String actual = FizzBuzz.fizzBuzz(number);
        String expected = "Fizz";
        assertEquals(expected,actual);
    }
    @Test
    void fizzBuzz2() {
        int number = 10;
        String actual = FizzBuzz.fizzBuzz(number);
        String expected = "Buzz";
        assertEquals(expected,actual);
    }
    @Test
    void fizzBuzz3() {
        int number = 15;
        String actual = FizzBuzz.fizzBuzz(number);
        String expected = "FizzBuzz";
        assertEquals(expected,actual);
    }
    @Test
    void fizzBuzz4() {
        int number = 7;
        String actual = FizzBuzz.fizzBuzz(number);
        String expected = Integer.toString(number);
        assertEquals(expected,actual);
    }
}