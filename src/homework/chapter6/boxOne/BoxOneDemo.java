package homework.chapter6.boxOne;

import homework.chapter6.boxOne.BoxOne;

public class BoxOneDemo {
    public static void main(String[] args) {
        BoxOne myBox = new BoxOne();
        BoxOne myBox1 = new BoxOne();
        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println(vol);

        myBox1.width = 3;
        myBox1.height = 6;
        myBox1.depth = 9;

        vol = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println(vol);
    }
}
