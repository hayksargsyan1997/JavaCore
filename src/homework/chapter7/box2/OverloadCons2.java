package homework.chapter7.box2;

import homework.chapter7.box2.Box2;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box2 myBox1 = new Box2(10, 20, 15);
        Box2 myBox2 = new Box2();
        Box2 myCube = new Box2(7);
        Box2 myClone = new Box2(myBox1);
        double vol;
        System.out.println("Volume is myBox1 is " + myBox1.volume());
        System.out.println("Volume is myBox2 is " + myBox2.volume());
        System.out.println("Volume is cube is " + myCube.volume());
        System.out.println("Volume is clone is " + myClone.volume());
    }


}
