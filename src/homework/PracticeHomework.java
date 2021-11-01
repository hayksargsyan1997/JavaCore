package homework;

public class PracticeHomework {
    long convert(int minutes) {
        return minutes * 60;
    }

    int calcAge(int years) {
        if (years % 4 == 0) {
            return 366;
        }
        return 365;
    }

    int nextNumber(int number) {
        return ++number;
    }

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        }
        return false;
    }

    boolean lessThanOrEqualToZero(int number) {
        return number <= 0;
    }

    boolean reverseBool(boolean value) {

        return !value;

    }

    int maxLength(int[] array, int[] array2) {

        if (array.length > array2.length) {
            return array.length;
        }
        return array2.length;

    }

}
