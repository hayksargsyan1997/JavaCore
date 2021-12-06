package homework.chapter9.intStack;

public class IFTest {
    public static void main(String[] args) {
        FixedStacked myStack1 = new FixedStacked(5);
        FixedStacked myStack2 = new FixedStacked(8);
        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }
        System.out.println("Stack in myStack1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Stack in myStack2:");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
