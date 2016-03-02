package euler;

import java.util.stream.LongStream;

public class LargestPalindromeProduct {

    private final static long FROM = 100;
    private final static long TO = 1000;

    public static void main(String[] args) {

/*
        System.out.println("Max palindrome: " + LongStream.range(FROM, TO)
                .flatMap(x -> LongStream.rangeClosed(FROM, TO).map(z -> z * x))
                .filter(LargestPalindromeProduct::isPalindrome)
                .max()
                .orElseThrow(() -> new RuntimeException("No palindromes in range")));
*/

        for (long row = 1; row <= (TO - FROM); row++ ) {
            for (long z = 0; z <= row / 2; z++) {
                long x = TO - row + z;
                long y = TO - z;

                long candidate = x * y;

                if (isPalindrome(candidate)) {
                    System.out.println("Max palindrome: " + candidate);
                    return;
                }
            }
        }


    }

    public static boolean isPalindrome(long number) {
        String s = "" + number;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
