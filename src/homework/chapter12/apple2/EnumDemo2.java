package homework.chapter12.apple2;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple2 ap;
        System.out.println("Winesap costs " +
                Apple2.WINESAP.getPrice() + "cents.\n");
        System.out.println("All apples and prices:");
        for (Apple2 a : Apple2.values()) {
            System.out.println(a + "costs " + a.getPrice() + "cents.");
        }
    }
}
