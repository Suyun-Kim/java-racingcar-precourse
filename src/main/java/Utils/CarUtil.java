package Utils;

import java.util.Arrays;
import java.util.List;

public class CarUtil {
    private static final String DIVISION_TEXT = ",";

    public static List<String> divideByCommas(String names) {
        return Arrays.asList(names.split(DIVISION_TEXT));
    }

}