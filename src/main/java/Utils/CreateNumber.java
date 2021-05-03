package Utils;

public class CreateNumber {

    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 9;

    public static int generateRandomNumber() {
        return  (int) (Math.random() * (MAX_NUM - MIN_NUM) + MIN_NUM);
    }
}
