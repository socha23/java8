package euler;

public class LargestPrimeFactor {

    private final static long NUMBER = 600851475143L;

    public static void main(String[] args) {


        long num = NUMBER;
        long factor = 2;
        while (factor <= (long)Math.sqrt(NUMBER) - 1) {
            if (num == factor) {
                break;
            } else if (num % factor == 0) {
                num /= factor;
            } else {
                factor++;
            }
        }
        System.out.println(num);
    }
}
