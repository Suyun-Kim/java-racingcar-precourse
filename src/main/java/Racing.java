import Utils.CarUtil;
import Utils.Validation;
import car.Car;

import java.util.List;

public class Racing {

    private static int userNumber = 0;
    private static String carNames = "";
    private static List<Car> cars;

    public static void startRacing() {

        cars = CarUtil.divideByCommas(CarUtil.inputCarNames());


    }
}
