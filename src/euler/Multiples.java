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

import euler.util.FiniteArithmeticProgression;

public class Multiples {

    private final static int MAX = 1000;

    public static void main(String[] args) {
        System.out.println(sumMultiples(5, MAX - 1) + sumMultiples(3, MAX - 1) - sumMultiples(15, MAX - 1));
    }

    private static long sumMultiples(int factor, int max) {
        return FiniteArithmeticProgression.multiplesOf(factor, max).sum();
    }
}
