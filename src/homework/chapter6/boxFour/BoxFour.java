package homework.chapter6.boxFour;

public class BoxFour {
    double width;
    double height;
    double dept;

    double volume() {

        return width * height * dept;
    }
    void setDim(double w,double h,double d){
        width=w;
        height=h;
        dept=d;
    }

}
