package euler.util;

import java.util.HashMap;
import java.util.Map;

public class PrimeFactors {

    private PrimeFactors result;

    private Map<Long, Long> factors = new HashMap<>();

    public static PrimeFactors ofNumber(long num) {

        PrimeFactors result = new PrimeFactors();

        long factor = 2;
        while (factor <= (long)Math.sqrt(num)) {
            if (factor == num) {
                break;
            } else if (num % factor == 0) {
                result.addFactor(factor);
                num /= factor;
            } else {
                factor++;
            }
        }
        result.addFactor(num);
        return result;
    }

    private void addFactor(long factor) {
        factors.put(factor, factors.getOrDefault(factor, 0L) + 1);
    }

    public void combine(PrimeFactors other) {
        other.factors.keySet().forEach(factor -> {
                    factors.put(factor, Math.max(factors.getOrDefault(factor, 0L), other.factors.get(factor)));
                }
        );
    }

    public long product() {
        long result = 1;
        for (long factor : factors.keySet()) {
            result *= Math.pow(factor, factors.get(factor));
        }
        return result;
    }


}
