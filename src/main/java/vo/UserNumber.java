package vo;

import Utils.Validation;

public class UserNumber {

    private int userNumber;

    public UserNumber(int userNumber) {
        this.setUserNumber(userNumber);
    }

    public void setUserNumber(int userNumber) {
        this.validationUserNumber(userNumber);
        this.userNumber = userNumber;

    }

    public int getUserNumber() {
        return this.userNumber;
    }

    private void validationUserNumber(int userNumber) {
        if(!Validation.checkCountRange(userNumber)) {
            throw new IllegalArgumentException("횟수 입력 범위는 1 ~ 9 입니다.");
        };
        
    }
}
