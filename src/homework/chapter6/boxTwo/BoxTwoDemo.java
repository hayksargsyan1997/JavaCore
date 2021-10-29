package homework.chapter6.boxTwo;

public class BoxTwoDemo {
    public static void main(String[] args) {
        BoxTwo myBox1 = new BoxTwo();
        BoxTwo myBox2 = new BoxTwo();

        myBox1.widht = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.widht = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        myBox1.volume();

        myBox2.volume();
    }
}
