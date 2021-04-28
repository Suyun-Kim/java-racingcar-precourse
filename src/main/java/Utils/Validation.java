package Utils;

public class Validation {

    private static final int MAX_LENGTH = 5;

    public static boolean checkLength(int nameLength) {
        return nameLength <= MAX_LENGTH;

    }

}
