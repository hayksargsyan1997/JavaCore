package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {10, 25, 15, 4, 2, 11, 48, 21, 22, -5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(  array[i] + " ");
        }
        System.out.println();

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        System.out.println("max = " + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {

                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        int countOfEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEven++;

            }

        }
        System.out.println("countOfEven = " + countOfEven);

        int countOfOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfOdd++;

            }
        }
        System.out.println("countOfOdd = " + countOfOdd);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        System.out.println("avg = " + sum / array.length);
        System.out.println("sum = " + sum);

    }
}