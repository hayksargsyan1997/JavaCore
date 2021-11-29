package homework.chapter8.override;

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        C subOb1 = new C(4, 5, 6);

        subOb.show();
        subOb1.show();
    }
}
