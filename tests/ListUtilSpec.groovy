import euler.util.ListUtil
import euler.util.SieveOfEratosthenes
import spock.lang.Specification

public class ListUtilSpec extends Specification {


    def "digits"() {
        expect:
        ListUtil.getDigits("12345") == [1, 2, 3, 4, 5]
        ListUtil.getDigits("   1   2\n34  5 ") == [1, 2, 3, 4, 5]
    }
}