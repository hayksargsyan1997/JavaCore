package homework.chapter7.box;

import homework.chapter7.box.Box;

public class OverloadCons {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);
        double vol;
        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);
        System.out.println("Volume of myBox2 is " + myBox2.volume());
        System.out.println("Volume of cube is " + myCube.volume());
    }

}
