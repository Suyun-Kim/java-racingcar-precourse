package Utils;

import car.Car;
import enums.MoveStatus;

import java.util.Collections;
import java.util.List;

public class RacingUtil {

    private static StringBuilder moveText;

    public static String printOutGame(Car car) {
        moveText = new StringBuilder(car.getCarName());

        moveText.append(" : ");

        for(int i = 0; i < car.getMoveCount(); i++) {
            moveText.append("-");
        }
        return moveText.toString();

    }

    public static int getMaxMoveCount(List<Car> cars) {
        int temp = cars.stream().mapToInt(Car::getMoveCount).filter(car -> car >= 0).max().orElse(0);
        return temp;
    }

    public static MoveStatus setVictoryStatus(int moveCount, int maxMoveCount) {

        if(moveCount == maxMoveCount) {
            return MoveStatus.VICTORY;
        }
        return MoveStatus.NON_VICTORY;
    }
}
