package homework.chapter8.demoShipment;

public class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;

    }

    Shipment(double w, double h, double d,
             double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;

    }
}
