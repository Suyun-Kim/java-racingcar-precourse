package car;

import Utils.Validation;
import enums.MoveStatus;

import java.util.List;

public class Car {

    private String carName;
    private int moveCount;
    private MoveStatus moveStatus;

    public Car(String carName) {
        this.carName = carName;
        this.moveCount = 0;

    }

    public void setCarName(String carName) {
        this.ValidationCarName(carName);
        this.carName = carName;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public int getMoveCount() {
        return this.moveCount;
    }

    public void setMoveStatus(MoveStatus moveStatus) {
        this.moveStatus = moveStatus;
    }

    public MoveStatus getMoveStatus() {
        return moveStatus;
    }

    public void ValidationCarName(String carName) {
        int carNameLength = carName.length();

        if (!Validation.checkIsEmptyCarName(carName)) {
            throw new IllegalArgumentException("자동차 명은 필수로 입력해야합니다.");
        }
        if (!Validation.checkNameLength(carNameLength)) {
            throw new IllegalArgumentException("자동차 명은 5자 이상을 넘길 수 없습니다.");
        }

    }

}