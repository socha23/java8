package euler;

import euler.util.ListUtil;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {

        long a = 1;
        long b = 1;
        long c = 1;

        outer:
        for (a = 1; a < 1000; a++) {
            for (b = a + 1; b < 1000; b++) {
                c = 1000 - a - b;
                if (a * a + b * b == c * c) {
                    break outer;
                }
            }
        }




        System.out.println(a * b * c);
    }

}
