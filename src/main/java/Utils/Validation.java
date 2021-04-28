package Utils;

public class Validation {

    private static final int MAX_NAME_LENGTH = 5;
    private static final int MIN_COUNT_LENGTH = 1;
    private static final int MAX_COUNT_LENGTH = 9;


    public static boolean checkNameLength(int nameLength) {
        return nameLength <= MAX_NAME_LENGTH;

    }

    public static boolean checkCountLength(int count) {
        return count >= MIN_COUNT_LENGTH && count <= MAX_COUNT_LENGTH;
    }
}
