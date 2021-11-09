package homework.braceChecker;


public class Stack {
    private int array[] = new int[10];
    private int index;

    Stack() {
        index = -1;
    }

    void push(int item) {
        if (index == array.length) {
            int[] array2 = new int[array.length + 10];
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
            }
            array = array2;
        }
        array[++index] = item;


    }

    int pop() {
        if (index < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else
            return array[index--];
    }


}

