package Utils;

import vo.Car;
import enums.MoveStatus;

import java.util.List;

public class RacingUtil {

    private static StringBuilder moveText;
    private static StringBuilder resultText;


    public static String printOutGame(Car car) {
        moveText = new StringBuilder(car.getCarName());

        moveText.append(" : ");

        for(int i = 0; i < car.getMoveCount(); i++) {
            moveText.append("-");
        }

        return moveText.toString();

    }

    public static String printGameResult(List<Car> cars) {
        resultText = new StringBuilder();
        for(Car car : cars) {
            if(car.getMoveStatus().equals(MoveStatus.VICTORY)) {
                resultText.append(car.getCarName());
                resultText.append(",");
            }
        }

        resultText.append("가 최종 우승했습니다.");

        return resultText.deleteCharAt(resultText.lastIndexOf(",")).toString();
    }

    public static int getMaxMoveCount(List<Car> cars) {
        int temp = cars.stream().mapToInt(Car::getMoveCount).filter(car -> car >= 0).max().orElse(0);
        return temp;
    }

    public static List<Car> setVictoryStatus(List<Car> cars, int maxMoveCount) {
        cars.forEach(car -> {
            if(car.getMoveCount() == maxMoveCount) {
                car.setMoveStatus(MoveStatus.VICTORY);
            }
            if(car.getMoveCount() != maxMoveCount) {
                car.setMoveStatus(MoveStatus.NON_VICTORY);
            }
        });

        return cars;
    }
}
