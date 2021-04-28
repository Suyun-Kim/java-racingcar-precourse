package Utils;

import java.util.Arrays;
import java.util.List;

public class CarUtil {

    public static List<String> divideByCommas(String names) {
        return Arrays.asList(names.split(","));
    }

}