package Utils;

import car.Car;

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


}
