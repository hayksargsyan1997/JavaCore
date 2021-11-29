package homework.chapter8.findArea;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Area foe Triangle.");
        return dim1 * dim2 / 2;
    }
}
