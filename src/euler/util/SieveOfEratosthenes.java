/***********************************************************
 * Autorskie Prawa Majatkowe -
 * Agencja Restrukturyzacji i Modernizacji Rolnictwa (ARiMR).
 * <p>
 * Copyright 2016 The Agency for Restructuring and
 * Modernisation of Agriculture (ARMA).
 * ***********************************************************
 * Opis: patrz ni�ej w komentarzach javadoc.
 * ***********************************************************
 * Osoba odpowiedzialna: Przemys�aw Socha
 ***********************************************************/

package euler.util;

import java.util.stream.IntStream;

public class SieveOfEratosthenes {


    private boolean initialized = false;
    private boolean[] sieve;

    private SieveOfEratosthenes(int upTo) {
        sieve = new boolean[upTo + 1];
    }

    private void initialize() {
        if (initialized) {
            return;
        }
        for (int i = 2; i < sieve.length; i++) {
            sieve[i] = true;
        }
        for (int i = 2; i <= (int)Math.sqrt(sieve.length); i++) {
            if (sieve[i]) {
                for (int j = i * i; j < sieve.length; j += i) {
                    sieve[j] = false;
                }
            }
        }
        initialized = true;
    }

    public boolean isPrime(int number) {
        if (!initialized) {
            initialize();
        }
        return sieve[number];
    }

    public static SieveOfEratosthenes upToClosed(int upTo) {
        SieveOfEratosthenes result = new SieveOfEratosthenes(upTo);
        result.initialize();
        return result;
    }

    public IntStream getPrimes() {
        return IntStream.range(1, sieve.length)
                .filter(i -> sieve[i]);
    }

}
