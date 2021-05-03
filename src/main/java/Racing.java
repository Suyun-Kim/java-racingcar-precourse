import Utils.CarUtil;
import Utils.CreateNumber;
import Utils.RacingUtil;
import vo.Car;
import vo.UserNumber;

import java.util.List;

public class Racing {

    private static int userNumber = 0;
    private static int maxMoveCount = 0;
    private static List<Car> cars;


    public static void startRacing() {

        cars = CarUtil.divideByCommas(CarUtil.inputCarNames());
        userNumber = new UserNumber(CarUtil.inputUserNumber()).getUserNumber();

        for(int i=0; i < userNumber; i++) {
            for(Car car : cars) {

                move(car);
                System.out.println(RacingUtil.printOutGame(car));
            }
        }

        getVictoryCars();
        System.out.print(RacingUtil.printGameResult(cars));
    }

    public static void move(Car car) {
        car.setMoveStatus(CarUtil.changeCarStatus(CreateNumber.generateRandomNumber()));
        car.setMoveCount(CarUtil.addMoveCount(car));

    }

    public static void getVictoryCars() {
        maxMoveCount = RacingUtil.getMaxMoveCount(cars);
        cars = RacingUtil.setVictoryStatus(cars, maxMoveCount);

    }






}
