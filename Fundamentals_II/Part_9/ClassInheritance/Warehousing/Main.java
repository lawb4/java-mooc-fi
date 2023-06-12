package Fundamentals_II.Part_9.ClassInheritance.Warehousing;

public class Main {
    public static void main(String[] args) {
        /*ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        System.out.println(juice);*/

        /*ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        juice.addToWarehouse(1.0);
        System.out.println(juice);*/

        /*ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);


       juice.printAnalysis();*/

        ProductWarehouseWithHistory tv = new ProductWarehouseWithHistory("coffee", 10, 2);
        tv.addToWarehouse(4);
        tv.takeFromWarehouse(2);
        tv.printAnalysis();

    }
}
