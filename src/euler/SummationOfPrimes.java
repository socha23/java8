package euler;

import euler.util.SieveOfEratosthenes;

public class SummationOfPrimes {


    private final static int N = 2_000_000;

    public static void main(String[] args) {
        SieveOfEratosthenes sieve = SieveOfEratosthenes.upToClosed(N);
        long sum = sieve.getPrimes().mapToLong(Long::valueOf).sum();
        System.out.println(sum);
    }
}
