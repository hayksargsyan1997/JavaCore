package homework.chapter3;

public class LightClass {
    public static void main(String[] args) {
        int lightspeed;
        long days, seconds, distance;
        lightspeed = 18600;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("In "+ days);
        System.out.print("days light will travel about ");
        System.out.println(distance+" miles");
    }
}
