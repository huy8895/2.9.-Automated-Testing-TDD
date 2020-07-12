package FizzBuzz;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz)
            return FIZZ_BUZZ;
        if (isFizz)
            return FIZZ;
        if (isBuzz)
            return BUZZ;

        return number + "";
    }
}
