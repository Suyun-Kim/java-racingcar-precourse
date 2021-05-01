package Utils;

import enums.MoveStatus;

import java.util.Arrays;
import java.util.List;

public class CarUtil {
    private static final String DIVISION_TEXT = ",";

    private static CreateNumber createNumber;

    public static List<String> divideByCommas(String names) {
        return Arrays.asList(names.split(DIVISION_TEXT));
    }

    public static MoveStatus changeCarStatus(int randomNumber) {

        if(randomNumber < 4) {
            return MoveStatus.STOP;
        }
        return MoveStatus.MOVE;
    }
}