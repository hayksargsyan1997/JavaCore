package homework.chapter7.box;

public class Box {
    double width;
    double height;
    double dept;

    Box(double w,double h,double d){
       width=w;
       height=h;
       dept=d;
    }

    Box(){
        width=-1;
        height=-1;
        dept=-1;
    }

    Box(double len){
        width=height=dept=len;
    }
    double volume(){
        return width*height*dept;
    }
}
