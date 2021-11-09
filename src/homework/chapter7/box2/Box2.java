package homework.chapter7.box2;

public class Box2 {
    double width;
    double height;
    double dept;

    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        dept = ob.dept;

    }

    Box2(double w, double h, double d) {
        width = w;
        height = h;
        dept = d;
    }

    Box2() {
        width = -1;
        height = -1;
        dept = -1;
    }

    Box2(double len) {
        width = height = dept = len;
    }

    double volume() {
        return width * height * dept;
    }
}
