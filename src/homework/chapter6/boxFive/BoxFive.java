package homework.chapter6.boxFive;

public class BoxFive {
    double width;
    double height;
    double depth;

    BoxFive(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    double volume() {
        return width * height * depth;
    }

}
