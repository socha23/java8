import euler.util.SieveOfEratosthenes
import spock.lang.Specification

public class ErathostenesSieveSpec extends Specification {


    def "isPrime"() {
        given:
        SieveOfEratosthenes sieve = SieveOfEratosthenes.upToClosed(10);

        expect:
        sieve.isPrime(number) == prime

        where:
        number | prime
        0      | false
        1      | false
        2      | true
        3      | true
        4      | false
        5      | true
        6      | false
        7      | true
        8      | false
        9      | false
        10     | false

    }
}