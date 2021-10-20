package classwork;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {10, 25, 15, 4, 2, 11, 44, 21, 22, -5};
        int n = 44;
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                System.out.println(i);
            }

        }


        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                index = i;
            }
        }
        System.out.println(index);


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
