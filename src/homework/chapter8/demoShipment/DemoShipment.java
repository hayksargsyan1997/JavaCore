package homework.chapter8.demoShipment;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 =
                new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 =
                new Shipment(2, 3, 4, 0.76, 1.28);

        System.out.println("Volume of shipment1 is " + shipment1.volume());
        System.out.println("Weight of shipment1 is " + shipment1.weigh);
        System.out.println("Shipping cost: $" + shipment1.cost);
        System.out.println();

        System.out.println("Volume of shipment2 is " + shipment2.volume());
        System.out.println("Weight of shipment2 is " + shipment2.weigh);
        System.out.println("Shipping cost: $" + shipment2.cost);
    }

}

