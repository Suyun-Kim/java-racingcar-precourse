package car;

import Utils.Validation;
import enums.MoveStatus;

import java.util.List;

public class Car {

    private List<Car> cars;

    private String carName;

    private int moveCount;

    private MoveStatus moveStatus;


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
        if(!Validation.checkIsEmptyCarName(carName)) {
            throw new IllegalArgumentException("");
        }
        if(!Validation.checkNameLength(carNameLength)) {
            throw new IllegalArgumentException("");
        }
    }





}
