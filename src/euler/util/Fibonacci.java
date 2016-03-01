/***********************************************************
 * Autorskie Prawa Majatkowe -
 * Agencja Restrukturyzacji i Modernizacji Rolnictwa (ARiMR).
 * <p>
 * Copyright 2016 The Agency for Restructuring and
 * Modernisation of Agriculture (ARMA).
 * ***********************************************************
 * Opis: patrz ni¿ej w komentarzach javadoc.
 * ***********************************************************
 * Osoba odpowiedzialna: Przemys³aw Socha
 ***********************************************************/

package euler.util;

import java.util.function.LongSupplier;
import java.util.stream.LongStream;

public class Fibonacci {

    static public LongStream stream() {
        return LongStream.generate(
                new LongSupplier() {
                    private long prevPrev = 0;
                    private long prev = 1;

                    @Override
                    public long getAsLong() {
                        long current = prevPrev + prev;
                        prevPrev = prev;
                        prev = current;
                        return current;
                    }
                }
        );
    };

    public static LongStream streamUpToValue(long max) {
        return StreamUtil.takeWhile(stream(), fib -> fib < max);
    }

}
