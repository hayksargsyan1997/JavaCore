package homework.chapter8.override;

public class C extends A {
    int x;

    C(int a, int b, int c) {
        super(a, b);
        x = c;
    }

    void show() {
        super.show();
        System.out.println("x: " + x);
    }
}
