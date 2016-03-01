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

package sandbox;

import java.util.Optional;

public class ConcreteClass {




    public void printIfPresent(Optional<Integer> arg) {

        arg.map(i -> "I got " + i).orElse("I got nuffin");
    }

}
