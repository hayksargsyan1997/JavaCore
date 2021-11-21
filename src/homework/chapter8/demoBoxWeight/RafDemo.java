package homework.chapter8.demoBoxWeight;

public class RafDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        System.out.println("Volume of weightBox is " + weightBox.volume());
        System.out.println("Weight of weightBox is " + weightBox.weight);
        System.out.println();

        plainBox = weightBox;
        System.out.println("Volume of plainBox is " + plainBox.volume());

    }
}
