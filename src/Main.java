import java.util.Arrays;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        String separator = ", ";
        Arrays.asList(1, 2, 3).forEach(i -> out.println(i + separator));

    }

}
