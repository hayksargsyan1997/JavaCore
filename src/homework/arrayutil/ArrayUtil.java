package homework.arrayUtil;

public class ArrayUtil {
    void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    void even(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                ;
            }
        }
        System.out.println();
    }
    void odd(int[]array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {

                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
    int cauntOfEven(int[]array){
        int countOfEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEven++;

            }

        }
       return countOfEven;

    }
    int cauntOfOdd(int[]array){
        int countOfOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfOdd++;

            }
        }
       return countOfOdd;
    }
    void sum(int[]array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        System.out.println("avg = " + sum / array.length);
        System.out.println("sum = " + sum);
    }
    void sort(int[]array){
        int tmp = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }

    }
}
