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

package euler;

import euler.util.Fibonacci;

public class EvenFibonacciNumbers {

    private final static long MAX = 4_000_000;

    public static void main(String[] args) {
        System.out.println(
                Fibonacci.streamUpToValue(MAX)
                        .filter(n -> n % 2 == 0)
                        .sum()
        );
    }
}
