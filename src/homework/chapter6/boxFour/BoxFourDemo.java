package homework.chapter6.boxFour;

public class BoxFourDemo {
    public static void main(String[] args) {
        BoxFour myBox1 = new BoxFour();
        BoxFour myBox2 = new BoxFour();
        double vol;

        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        vol = myBox1.volume();
        System.out.println("Volume is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume is " + vol);
    }
}
