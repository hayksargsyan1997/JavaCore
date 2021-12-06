package homework.chapter9.p2;

import homework.chapter9.p1.Protection;

class OtherPackage {

    OtherPackage() {
        Protection p = new Protection();
        System.out.println("other package constructor");
        System.out.println("n_pub" + p.n_pub);
    }

}
