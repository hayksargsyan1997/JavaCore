package homework.chapter9.callback;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new AnotherClient();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob;
        c.callback(42);
    }


}
