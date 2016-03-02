package euler;

import euler.util.SieveOfEratosthenes;

public class NthPrime {


    private final static int N = 10001;

    public static void main(String[] args) {
        int sieveSize = findSieveSize(N);
        System.out.println("Sieve size: " + sieveSize);
        SieveOfEratosthenes sieve = SieveOfEratosthenes.upToClosed(sieveSize);
        int[] primes = sieve.getPrimes().toArray();
        System.out.println(primes[N - 1]);
    }

    private static int findSieveSize(int primeNo) {
        int x = 10;
        while (x / Math.log(x) < primeNo) {
            x *= 1.1;
        }
        return x;

    }
}
