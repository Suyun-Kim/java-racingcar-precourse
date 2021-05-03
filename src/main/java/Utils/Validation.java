package Utils;

import vo.Car;

import java.util.ArrayList;
import java.util.List;

public class Validation {

    private static final int MAX_NAME_LENGTH = 5;
    private static final int MIN_COUNT = 1;
    private static final int MAX_COUNT = 9;

    public static boolean checkNameLength(int nameLength) {
        return nameLength <= MAX_NAME_LENGTH;

    }

    public static boolean checkCountRange(int count) {
        return count >= MIN_COUNT && count <= MAX_COUNT;

    }

    public static boolean checkDuplicate(List<Car> carNames) {

        List<String> temp = new ArrayList<>();

        for(Car car : carNames) {
            if(temp.contains(car.getCarName())) {
                return false;
            }
            temp.add(car.getCarName());
        }

        return true;

    }

    public static boolean checkIsEmptyCarName(String carNames) {
        return !carNames.isEmpty();
    }
}
