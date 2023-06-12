package Fundamentals_II.Part_9.ClassInheritance.Warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.history = new ChangeHistory();

        this.addToWarehouse(initialBalance);
    }

    public String history() {
        return history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double received = super.takeFromWarehouse(amount);
        history.add(getBalance());

        return received;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName() + "\n" +
                "History: " + this.history() + "\n" +
                "Largest amount of product: " + history.maxValue() + "\n" +
                "Smallest amount of product: " + history.minValue() + "\n" +
                "Average: " + history.average());
    }
}
