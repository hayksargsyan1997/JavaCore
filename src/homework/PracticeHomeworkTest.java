package homework;

import homework.PracticeHomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();

        System.out.println(ph.convert(5));

        System.out.println(ph.calcAge(2021));

        System.out.println(ph.nextNumber(8));

        System.out.println(ph.isSameNum(15, 25));

        System.out.println(ph.lessThanOrEqualToZero(-5));

        System.out.println(ph.reverseBool(false));

        int[] array = {10, 24, 15, 18, 25, 45};
        int[] array2 = {11, 26, 12, 28, 65, 90, 21, 44, 101, 5};
        System.out.println(ph.maxLength(array, array2));


    }
}
