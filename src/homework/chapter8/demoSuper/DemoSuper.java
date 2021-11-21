package homework.chapter8.demoSuper;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myCube = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(myBox1);

        System.out.println("Volume of myBox1 is " + myBox1.volume());
        System.out.println("Weight of myBox1 is " + myBox1.weigh);
        System.out.println();

        System.out.println("Volume of myBox2 is " + myBox2.volume());
        System.out.println("Weight of myBox2 is " + myBox2.weigh);
        System.out.println();

        System.out.println("Volume of myBox3 is " + myBox3.volume());
        System.out.println("Weight of myBox3 is " + myBox3.weigh);
        System.out.println();

        System.out.println("Volume of myClone is " + myClone.volume());
        System.out.println("Weight of myClone is " + myClone.weigh);
        System.out.println();

        System.out.println("Volume of myCube is " + myCube.volume());
        System.out.println("Weight of myCube is " + myCube.weigh);
        System.out.println();
    }
}
