package homework.chapter9.p1;

class Derived extends Protection {
    Derived() {
        System.out.println("derived constructor");
        System.out.println("n= " + n);
        System.out.println("n_Pro= " + n_pro);
        System.out.println("n_pub= " + n_pub);
    }

}
