package homework.chapter6.boxThree;

public class BoxThreeDemo {
    public static void main(String[] args) {
        BoxThree myBox1 = new BoxThree();
        BoxThree myBox2 = new BoxThree();
        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox1.volume();
        System.out.println("Volume is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume is " + vol);
    }
}
