package homework.chapter8.demoShipment;

public class BoxWeight extends Box {
    double weigh;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weigh = ob.weigh;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weigh = m;
    }

    BoxWeight() {
        super();
        weigh = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weigh = m;
    }

}
