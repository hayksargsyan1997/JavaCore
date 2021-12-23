package homework.chapter12.apple;

public class EnumDemo1 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Here are all Apple constants:");
        Apple[] allApples = Apple.values();
        for (Apple a : allApples) {
            System.out.print(a + " ");
        }
        System.out.println();
        ap = Apple.valueOf("WINESAP");
        System.out.println("ap contains " + ap);
    }
}
