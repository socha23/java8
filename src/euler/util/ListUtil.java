/***********************************************************
 * Autorskie Prawa Majatkowe -
 * Agencja Restrukturyzacji i Modernizacji Rolnictwa (ARiMR).
 * <p>
 * Copyright 2016 The Agency for Restructuring and
 * Modernisation of Agriculture (ARMA).
 * ***********************************************************
 * Opis: patrz niżej w komentarzach javadoc.
 * ***********************************************************
 * Osoba odpowiedzialna: Przemysław Socha
 ***********************************************************/

package euler.util;

import java.util.List;
import java.util.stream.Collectors;

public class ListUtil {


    public static List<Integer> getDigits(String str) {
        return str.replaceAll("\\s", "")
                .chars()
                .mapToObj(i -> Integer.parseInt("" + (char)i))
                .collect(Collectors.toList());

    }
}
