package homework.arrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        int[] array = {8, 4, 10, 22, 50, 11, 15, 39, -5, 25};
        au.print(array);

        int arrayMax = au.max(array);
        System.out.println("max= " + arrayMax);

        int arrayMin = au.min(array);
        System.out.println("min= "+arrayMin);

        au.even(array);

        au.odd(array);

        int cauntOfEven=au.cauntOfEven(array);
        System.out.println("cauntOfEven= " + cauntOfEven);

        int cauntOfOdd=au.cauntOfOdd(array);
        System.out.println("cauntOfOdd= "+ cauntOfOdd);

        au.sum(array);

        au.sort(array);

    }

}
