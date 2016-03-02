package euler;

import euler.util.PrimeFactors;

public class SmallestMultiple {

    private final static long FROM = 1;
    private final static long TO = 20;

    public static void main(String[] args) {

        PrimeFactors factors = PrimeFactors.ofNumber(TO);
        for (long i = TO - 1; i >= FROM; i--) {
            factors.combine(PrimeFactors.ofNumber(i));
        }
        System.out.println(factors.product());
    }
}
