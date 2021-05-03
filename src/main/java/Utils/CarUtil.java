package Utils;

import vo.Car;
import enums.MoveStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarUtil {

    private static final String DIVISION_TEXT = ",";
    private static final int STOP_NUMBER = 4;

    private static List<Car> cars;

    public static List<Car> divideByCommas(String names) {
        cars = new ArrayList<Car>();

        String[] arrayNames = names.split(DIVISION_TEXT);

        for(String name : arrayNames) {
            cars.add(new Car(name));
        };

        return cars;
    }

    public static MoveStatus changeCarStatus(int randomNumber) {

        if(randomNumber < STOP_NUMBER) {
            return MoveStatus.STOP;
        }
        return MoveStatus.MOVE;

    }

    public static int addMoveCount(Car car) {
        MoveStatus moveStatus = car.getMoveStatus();
        int moveCount = car.getMoveCount();

        if(moveStatus.equals(MoveStatus.MOVE)) {
            car.setMoveCount(moveCount+1);
        }
        return car.getMoveCount();

    }

    public static int inputUserNumber() {
        System.out.println("시도 할 횟수를 입력해주세요.");

        Scanner sc = new Scanner(System.in);

        return sc.nextInt();

    }

    public static String inputCarNames() {
        System.out.println("자동차 명을 입력해주세요.");

        Scanner sc = new Scanner(System.in);

        return sc.next();
    }
}