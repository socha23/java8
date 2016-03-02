package euler;

import euler.util.FiniteArithmeticProgression;

public class SumSquareDifference {

    private final static long TO = 100;

    public static void main(String[] args) {
        FiniteArithmeticProgression fap = new FiniteArithmeticProgression(1, 1, TO);

        System.out.println(
                (long)  Math.pow(fap.sum(), 2) - pyramidal(TO)
        );
    }

    private static long pyramidal(long howMuch) {
        return (long)(2 * Math.pow(howMuch, 3) + 3 * Math.pow(howMuch, 2) + howMuch) / 6;
    }
}
