package homework.chapter6.stack;

public class Stack {
    int stck[] = new int[10];
    int index;

    Stack() {
        index = -1;
    }

    void push(int item) {
        if (index == 9)
            System.out.println("Stack is full.");
        else stck[++index] = item;
    }

    int pop() {
        if (index < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else
            return stck[index--];
    }
}
