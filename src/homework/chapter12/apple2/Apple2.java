package homework.chapter12.apple2;

public enum Apple2 {
    JONATHAN(10),
    GOLDEN_DEL(9),
    RED_DEL(12),
    WINESAP(15),
    CORTLAND(8);

    private int price;

    Apple2(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }


}
