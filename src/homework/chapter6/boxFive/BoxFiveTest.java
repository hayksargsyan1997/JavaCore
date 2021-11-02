package homework.chapter6.boxFive;

import homework.chapter6.box.Box;

public class BoxFiveTest {
    public static void main(String[] args) {
        BoxFive myBox = new BoxFive(10, 20, 15);
        BoxFive myBox2 = new BoxFive(3, 6, 9);
        System.out.println(myBox.volume());
        System.out.println(myBox2.volume());

    }
}
