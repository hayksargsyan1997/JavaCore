package homework.chapter13;

public class Hypotenuse {
    public static void main(String[] args) {
        double side1, side2;
        double hypotenuse;
        side1 = 3.0;
        side2 = 4.0;
        hypotenuse = Math.sqrt(Math.pow(side1, 2) +
                Math.pow(side2, 2));
        //hypotenuse=sqr(pow(side1,2)+pow(side2,2))
        System.out.println("Given sides of lengths " +
                side1 + " and " + side2 +
                "the hypotenuse " + hypotenuse);
    }
}
