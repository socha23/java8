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

public class FiniteArithmeticProgression {

    private int first;
    private int step;
    private int n;

    public FiniteArithmeticProgression(int first, int step, int n) {
        this.first = first;
        this.step = step;
        this.n = n;
    }

    public static FiniteArithmeticProgression multiplesOf(int factor, int upTo) {
        return new FiniteArithmeticProgression(factor, factor, upTo / factor);
    }

    // 0-based indexes
    public int member(int which) {
        return first + which * step;
    }

    public long sum() {
        return (member(0) + member(n - 1)) * n / 2;
    }


}
