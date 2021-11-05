package homework.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da=new DynamicArray();
        da.add(6);
        da.add(4);
        System.out.println(da.getByIndex( 0));
        System.out.println(da.getByIndex(2));
        da.print();
    }
}
