package homework.chapter5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "two";
        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("tree");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }
}
